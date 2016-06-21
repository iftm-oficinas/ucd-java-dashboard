package modelo.dao;

import java.sql.Connection;

public class UserDAO {

    private final Connection connection;

    public UserDAO(Connection connection) {
        this.connection = connection;
    }
}
