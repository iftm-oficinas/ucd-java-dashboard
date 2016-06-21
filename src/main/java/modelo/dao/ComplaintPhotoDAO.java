package modelo.dao;

import java.sql.Connection;

public class ComplaintPhotoDAO {

    private final Connection connection;

    public ComplaintPhotoDAO(Connection connection) {
        this.connection = connection;
    }
}
