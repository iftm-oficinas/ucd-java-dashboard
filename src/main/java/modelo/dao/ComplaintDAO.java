package modelo.dao;

import java.sql.Connection;

public class ComplaintDAO {

    private final Connection connection;

    public ComplaintDAO(Connection connection) {
        this.connection = connection;
    }
}
