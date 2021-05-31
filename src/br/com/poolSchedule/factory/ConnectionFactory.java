package br.com.poolSchedule.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private static final String USERNAME = "postgres";

    private static final String PASSWORD = "root";

    private static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/poo";

    public static Connection createConnection() throws Exception {
        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

        return connection;
    }

    public static void main(String[] args) throws Exception {
        Connection con = createConnection();

        if (con != null) {
            System.out.println("Conexão obtida com sucesso!");
            con.close();
        }
    }
}
