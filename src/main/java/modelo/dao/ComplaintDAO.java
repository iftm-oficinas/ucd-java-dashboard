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

        String query = "INSERT INTO complaint (id_user, status, latitude, longitude, description) VALUES (?, ?, ?, ?, ?);";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setInt(1, 2);
            pstmt.setString(2, "STARTED");
            pstmt.setString(3, complaint.getLatitude());
            pstmt.setString(4, complaint.getLongitude());
            pstmt.setString(5, complaint.getDescription());
            pstmt.executeUpdate();
            return "SUCCESS";
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }

    public String update(Complaint complaint) throws SQLException {
        String alteracao = "UPDATE complaint SET latitude = ?, longitude = ?, description = ? WHERE id = ?;";
        try (PreparedStatement pstmt = connection.prepareStatement(alteracao)) {
            pstmt.setString(1, complaint.getLatitude());
            pstmt.setString(2, complaint.getLongitude());
            pstmt.setString(3, complaint.getDescription());
            pstmt.setInt(4, complaint.getId());
            pstmt.executeUpdate();
            return "SUCCESS";
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }

    public Complaint fetchOne(Integer idComplaint) throws SQLException {
        String query = "SELECT * FROM complaint WHERE id = ?";
        Complaint complaint = new Complaint();
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setInt(1, idComplaint);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    complaint = new Complaint();
                    complaint.setId(rs.getInt(1));
                    complaint.setId_user(rs.getInt(2));
                    complaint.setId_inspector(rs.getInt(3));
                    complaint.setStatus(rs.getString(4));
                    complaint.setLatitude(rs.getString(5));
                    complaint.setLongitude(rs.getString(6));
                    complaint.setDescription(rs.getString(7));
                }
            }
        }
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
                    complaint.setStatus(rs.getString(4));
                    complaint.setLatitude(rs.getString(5));
                    complaint.setLongitude(rs.getString(6));
                    complaint.setDescription(rs.getString(7));
                    complaints.add(complaint);
                }
            }
        }
        return complaints;
    }

    public String delete(Complaint complaint) throws SQLException {
        String query = "DELETE FROM complaint WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setInt(1, complaint.getId());
            pstmt.executeUpdate();
            return "SUCCESS";
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
}
