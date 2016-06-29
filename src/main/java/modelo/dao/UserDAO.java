package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.User;

public class UserDAO {

    private final Connection connection;

    public UserDAO(Connection connection) {
        this.connection = connection;
    }

    public String save(User user) throws SQLException {

        String query = "INSERT INTO user (name, email, password, inspector, score) VALUES (?, ?, ?, ?, ?);";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getPassword());
            
            System.out.println(user.getInspector());
            
            if (user.getInspector() != null) {
                pstmt.setByte(4, (byte)1);
            }else{
                pstmt.setByte(4, (byte)0);
            }
            pstmt.setByte(5, (byte)0);
            int result = pstmt.executeUpdate();
            if (result == 1) {
                return ("\nInserção bem sucedida.");
            } else {
                return ("A inserção não foi feita corretamente.");
            }
        }
//        User user = new User();
//        return user;
    }

    public String update(User user) throws SQLException {

        String query = "UPDATE user SET name = ?, email = ?, password = ?, Inspector = ? WHERE id = ?;";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getPassword());
            pstmt.setByte(4, user.getInspector());
            pstmt.setInt(5, user.getId());
            int alteracoes = pstmt.executeUpdate();
            if (alteracoes == 1) {
                return ("\nAlteracao bem sucedida.");
            } else {
                return ("A alteracao não foi feita corretamente.");
            }
        }
    }

    public User fetchOne(Integer idUser) {
        User user = new User();
        return user;
    }

    public List<User> fetchAll() throws SQLException {

        User user;
        List<User> users = new ArrayList<>();
        String query = "SELECT * FROM user";
        try (Statement stmt = connection.createStatement()) {
            try (ResultSet rs = stmt.executeQuery(query)) {
                while (rs.next()) {
                    user = new User();
                    user.setId(rs.getInt(1));
                    user.setName(rs.getString(2));
                    user.setEmail(rs.getString(3));
                    user.setPassword(rs.getString(4));
                    user.setInspector(rs.getByte(5));
                    user.setScore(rs.getByte(6));
                    users.add(user);
                }
            }
        }

        return users;
    }

    public Boolean delete(Integer idUser) {
        return true;
    }

    public List<User> fetchAllOrderByScore() {
        List<User> users = new ArrayList<>();
        return users;
    }
}
