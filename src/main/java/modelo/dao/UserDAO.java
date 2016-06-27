package modelo.dao;

import java.sql.Connection;
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
    
    public User save(){
        User user = new User();
        return user;
    }
    
    public User update(User user) {
        return user;
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
