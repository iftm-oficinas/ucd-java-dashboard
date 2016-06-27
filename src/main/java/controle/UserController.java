package controle;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import modelo.User;
import modelo.dao.DAOFactory;
import modelo.dao.UserDAO;

@Controller
public class UserController {

    @Inject
    private Result result;

    public List<User> index() {
        // busca a página e mostra saspoha tudo.

        List<User> users = new ArrayList<>();
        DAOFactory factory = new DAOFactory();
        try {
            factory.openConnection();
            UserDAO dao = factory.createUserDAO();
            users = dao.fetchAll();
        } catch (SQLException ex) {
            System.out.println("Erro no acesso ao banco de dados.");
            DAOFactory.showSQLException(ex);
        } finally {
            try {
                factory.closeConnection();
            } catch (SQLException ex) {
                System.out.println("Erro ao fechar a conexão com o BD.");
                DAOFactory.showSQLException(ex);
            }
        }
        return users;
    }

    public void create() {
        // retorna somente a view.
    }

    public User store() {
        // save.

        User user = new User();
        return user;
    }

    public User edit(Integer idComplaint) {
        // buscar o manolo pelo id pra editar.

        User user = new User();
        return user;
    }

    public User update(User user) {
        // alera o cara aqui.

        return user;
    }

    public Boolean destroy(Integer idComplaint) {
        // kill him!!

        return true;// ou falso se der errado (try/catch)
    }

}
