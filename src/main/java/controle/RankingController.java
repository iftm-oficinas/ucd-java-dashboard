package controle;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.jasperreports.Report;
import br.com.caelum.vraptor.jasperreports.ReportBuilder;
import br.com.caelum.vraptor.jasperreports.download.ReportDownload;
import static br.com.caelum.vraptor.jasperreports.formats.ExportFormats.pdf;
import br.com.caelum.vraptor.observer.download.Download;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.dao.FactoryConnection;

@Controller
public class RankingController {
    
    public void index() {
        //Default index page.
    }
    
    public Download report() {
        Report report = null;
        try {
            report = new ReportBuilder()
                    .withTemplate("ranking.jasper")
                    .addParam("java.sql.Connection", FactoryConnection.getConnection())
                    .withFileName("ranking")
                    .build();
        } catch (SQLException ex) {
            Logger.getLogger(RankingController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ReportDownload(report, pdf());
    }
}