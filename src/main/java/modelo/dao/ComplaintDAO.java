package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Complaint;

public class ComplaintDAO {

    private final Connection connection;

    public ComplaintDAO(Connection connection) {
        this.connection = connection;
    }
    
    public Complaint save(Complaint complaint){
        
        String query = "INSERT INTO complaint (id_user, id_complaint, status, latitude, longitude, description) VALUES (?, ?, ?, ?, ?, ?);";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, complaint.getId_user().toString());
            pstmt.setString(2, complaint.getId_inspector().toString());
            pstmt.setString(3, complaint.getStatus());
            pstmt.setString(4, complaint.getLatitude());
            pstmt.setString(5, complaint.getLongitude());
            pstmt.setString(6, complaint.getDescription());
            pstmt.executeUpdate();
        } catch(Exception ex) {
            return null;
        }
        
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
