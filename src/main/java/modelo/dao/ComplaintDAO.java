package modelo.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import modelo.Complaint;

public class ComplaintDAO {

    private final Connection connection;

    public ComplaintDAO(Connection connection) {
        this.connection = connection;
    }
    
    public Complaint save(){
        Complaint complaint = new Complaint();
        return complaint;
    }
    
    public Complaint update(Complaint complaint) {
        return complaint;
    }
    
    public Complaint fetchOne(Integer idComplaint) {
        Complaint complaint = new Complaint();
        return complaint;
    }
    
    public List<Complaint> fetchAll() {
        List<Complaint> complaints = new ArrayList<>();
        return complaints;
    }
    
    public Boolean delete(Integer idComplaint) {
        return true;
    }
}
