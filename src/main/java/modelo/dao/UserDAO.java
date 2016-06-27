package modelo.dao;

import java.sql.Connection;
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
    
    public List<User> fetchAll() {
        List<User> users = new ArrayList<>();
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
