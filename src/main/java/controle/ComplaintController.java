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
    
    public void store (Complaint complaint) {
        DAOFactory factory = new DAOFactory();
        try {
            factory.openConnection();
            ComplaintDAO dao = factory.createComplaintDAO();
            dao.save(complaint);
        } catch (SQLException ex) {
            DAOFactory.showSQLException(ex);
        } finally {
            try {
                factory.closeConnection();
            } catch (SQLException ex) {
                DAOFactory.showSQLException(ex);
            }
        }
        result.redirectTo(ComplaintController.class).index();
    }
    
    public Complaint edit(Integer idComplaint) {
        Complaint complaint = null;
        DAOFactory factory = new DAOFactory();
        try {
            factory.openConnection();
            ComplaintDAO dao = factory.createComplaintDAO();
            complaint = dao.fetchOne(idComplaint);
        } catch (SQLException ex) {
            DAOFactory.showSQLException(ex);
        } finally {
            try {
                factory.closeConnection();
            } catch (SQLException ex) {
                DAOFactory.showSQLException(ex);
            }
        }
        return complaint;
    }
    
    public void update(Complaint complaint) {
        DAOFactory factory = new DAOFactory();
        try {
            factory.openConnection();
            ComplaintDAO dao = factory.createComplaintDAO();
            dao.update(complaint);
        } catch (SQLException ex) {
            DAOFactory.showSQLException(ex);
        } finally {
            try {
                factory.closeConnection();
            } catch (SQLException ex) {
                DAOFactory.showSQLException(ex);
            }
        }
        
        result.redirectTo(ComplaintController.class).index();
    }
    
    public void destroy(Integer idComplaint) {
        DAOFactory factory = new DAOFactory();
        try {
            factory.openConnection();
            ComplaintDAO dao = factory.createComplaintDAO();
            Complaint complaint = dao.fetchOne(idComplaint);
            dao.delete(complaint);
        } catch (SQLException ex) {
            DAOFactory.showSQLException(ex);
        } finally {
            try {
                factory.closeConnection();
            } catch (SQLException ex) {
                DAOFactory.showSQLException(ex);
            }
        }
        
        result.redirectTo(ComplaintController.class).index();
    }

}