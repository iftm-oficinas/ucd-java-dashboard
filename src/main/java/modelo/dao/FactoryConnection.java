package modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactoryConnection {

    public static Connection getConnection() throws SQLException {
        String caminho = "jdbc:mysql";
        //String caminho = "jdbc:postgresql";
        String host = "localhost";
        String porta = "3306";
        //String porta = "5432";
        String bd = "pv";
        String login = "root";
        //String login = "postgres";
        String senha = "12345";  // admwindows, admlinux ou vazia “”
        String url = caminho + "://" + host + ":" + porta + "/" + bd;

        Connection conexao = null;

        try {
            System.out.println("Conectando com o banco de dados.");
            Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("org.postgresql.Driver");
            conexao = DriverManager.getConnection(url, login, senha);
            System.out.println("Conexão com o banco de dados estabelecida.");
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o driver JDBC.");
        }
        return conexao;
    }

    private FactoryConnection() {
    }
}
