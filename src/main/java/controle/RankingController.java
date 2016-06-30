package controle;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.jasperreports.Report;
import br.com.caelum.vraptor.jasperreports.ReportBuilder;
import br.com.caelum.vraptor.jasperreports.download.ReportDownload;
import static br.com.caelum.vraptor.jasperreports.formats.ExportFormats.pdf;
import br.com.caelum.vraptor.observer.download.Download;
import java.sql.SQLException;
import javax.servlet.ServletContext;
import modelo.dao.FactoryConnection;

@Controller
public class RankingController {
    
    public void index() {
        //Default index page.
    }
    
    public Download report(final ServletContext context) {
        Report report;
        try {
            String jasper = context.getRealPath("/WEB-INF/reports") + "/";
            report = new ReportBuilder()
                    .withTemplate("ranking.jasper")
                    .addParam("java.sql.Connection", FactoryConnection.getConnection())
                    .addParam("SUBREPORT_DIR", jasper)
                    .withFileName("ranking.pdf")
                    .build();
            return new ReportDownload(report, pdf());
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}