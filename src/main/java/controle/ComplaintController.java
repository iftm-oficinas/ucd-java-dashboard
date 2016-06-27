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
        // busca sapoha tudo.
        
        List<Complaint> users = new ArrayList<>();
        return users;
    }
    
    public void create() {
        // retorna somente a view.
    }
    
    public Complaint store () {
        // save.
        
        Complaint complaint = new Complaint();
        return complaint;
    }
    
    public Complaint edit(Integer idComplaint) {
        // buscar o manolo pelo id pra editar.
        
        Complaint complaint = new Complaint();
        return complaint;
    }
    
    public Complaint update(Complaint complaint) {
        // alera o cara aqui.
        
        return complaint;
    }
    
    public Boolean destroy(Integer idComplaint) {
        // kill him!!
        
        return true;// ou falso se der errado (try/catch)
    }

}