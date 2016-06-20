package controle;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.User;
import modelo.dao.DAOFactory;

@Controller
public class UserController {

    @Inject
    private Result result;

    public List<User> index() {
        List<User> users = new ArrayList<>();
        return users;
    }

    public List<User> create() {
        List<User> users = new ArrayList<>();
        return users;
    }
    
    public List<User> edit() {
        List<User> users = new ArrayList<>();
        return users;
    }
    
    
}
