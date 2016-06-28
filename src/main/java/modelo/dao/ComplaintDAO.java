package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Complaint;

public class ComplaintDAO {

    private final Connection connection;

    public ComplaintDAO(Connection connection) {
        this.connection = connection;
    }

    public String save(Complaint complaint) throws SQLException {

        String query = "INSERT INTO complaint (id_user, id_complaint, status, latitude, longitude, description) VALUES (?, ?, ?, ?, ?, ?);";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, complaint.getId_user().toString());
            pstmt.setString(2, complaint.getId_inspector().toString());
            pstmt.setString(3, complaint.getStatus());
            pstmt.setString(4, complaint.getLatitude());
            pstmt.setString(5, complaint.getLongitude());
            pstmt.setString(6, complaint.getDescription());
            pstmt.executeUpdate();
            return "SUCCESS";
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }

    public Complaint update(Complaint complaint) {
        return complaint;
    }

    public Complaint fetchOne(Integer idComplaint) {
        Complaint complaint = new Complaint();
        return complaint;
    }

    public List<Complaint> fetchAll() throws SQLException {
        Complaint complaint;
        List<Complaint> complaints = new ArrayList<>();
        String query = "SELECT * FROM complaint";
        try (Statement stmt = connection.createStatement()) {
            try (ResultSet rs = stmt.executeQuery(query)) {
                while (rs.next()) {
                    complaint = new Complaint();
                    complaint.setId(rs.getInt(1));
                    complaint.setId_user(rs.getInt(2));
                    complaint.setId_inspector(rs.getInt(3));
                    complaint.setLatitude(rs.getString(4));
                    complaint.setLongitude(rs.getString(5));
                    complaint.setStatus(rs.getString(6));
                    complaint.setDescription(rs.getString(7));
                    complaints.add(complaint);
                }
            }
        }
        return complaints;
    }

    public Boolean delete(Integer idComplaint) {
        return true;
    }
}
