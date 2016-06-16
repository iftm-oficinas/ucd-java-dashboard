package controle;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import modelo.Complaint;

@Controller
public class ComplaintController {
    
    @Inject
    private Result result;
    
    public List<Complaint> index() {
        List<Complaint> users = new ArrayList<>();
        return users;
    }

}