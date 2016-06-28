package controle;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import modelo.Complaint;
import modelo.dao.ComplaintDAO;
import modelo.dao.DAOFactory;

@Controller
public class ComplaintController {
    
    @Inject
    private Result result;
    
    public List<Complaint> index() {
        List<Complaint> complaints = new ArrayList<>();
        DAOFactory factory = new DAOFactory();
        try {
            factory.openConnection();
            ComplaintDAO dao = factory.createComplaintDAO();
            complaints = dao.fetchAll();
        } catch (SQLException ex) {
            DAOFactory.showSQLException(ex);
        } finally {
            try {
                factory.closeConnection();
            } catch (SQLException ex) {
                DAOFactory.showSQLException(ex);
            }
        }
        return complaints;
    }
    
    public void create() {
        // retorna somente a view.
    }
    
    public void store () {
        // save.
        
        result.redirectTo(ComplaintController.class).index();
    }
    
    public Complaint edit(Integer idComplaint) {
        // buscar o manolo pelo id pra editar.
        
        Complaint complaint = new Complaint();
        return complaint;
    }
    
    public void update(Complaint complaint) {
        // alera o cara aqui.
        
        result.redirectTo(ComplaintController.class).index();
    }
    
    public void destroy(Integer idComplaint) {
        // kill him!!
        
        result.redirectTo(ComplaintController.class).index();
    }

}