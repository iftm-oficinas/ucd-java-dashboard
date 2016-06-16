package controle;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import modelo.User;

@Controller
public class RankingController {

    @Inject
    private Result result;
    
    public List<User> index() {
        List<User> users = new ArrayList<>();
        return users;
    }
}