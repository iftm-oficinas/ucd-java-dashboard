package modelo.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class DAOFactory {

    private Connection conection = null;

    public UserDAO createUserDAO() {
        if (conection == null) {
            throw new IllegalStateException("[ERROR] Open a conecion before create a DAO.");
        } else {
            return new UserDAO(conection);
        }
    }

    public ComplaintDAO createComplaintDAO() {
        if (conection == null) {
            throw new IllegalStateException("[ERROR] Open a conecion before create a DAO.");
        } else {
            return new ComplaintDAO(conection);
        }
    }

    public ComplaintPhotoDAO createComplaintPhotoDAO() {
        if (conection == null) {
            throw new IllegalStateException("[ERROR] Open a conecion before create a DAO.");
        } else {
            return new ComplaintPhotoDAO(conection);
        }
    }

    public void openConnection() throws SQLException {
        if (conection == null) {
            conection = FactoryConnection.getConnection();
        } else {
            throw new IllegalStateException("[ERROR] The connection is already open.");
        }
    }

    public void closeConnection() throws SQLException {
        if (conection != null) {
            conection.close();
            conection = null;
            System.out.println("[INFO] Connection with the database is finish.");
        } else {
            throw new IllegalStateException("[ERROR] The connection is already close.");
        }
    }

    public void startTransaction() throws SQLException {
        conection.setAutoCommit(false);
    }

    public void closeTransaction() throws SQLException {
        conection.commit();
        conection.setAutoCommit(true);
    }

    public void abortTransaction() throws SQLException {
        conection.rollback();
        conection.setAutoCommit(true);
    }

    public static void showSQLException(SQLException ex) {
        SQLException e = ex;
        while (e != null) {
            System.out.println("SQL State: " + e.getSQLState());
            System.out.println("Error Code: " + e.getErrorCode());
            System.out.println("Message: " + e.getMessage());
            Throwable t = e.getCause();
            while (t != null) {
                System.out.println("[ERROR] " + t);
                t = t.getCause();
            }
            e = e.getNextException();
        }
    }

}
