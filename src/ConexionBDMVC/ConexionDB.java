package ConexionBDMVC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
        private static final String URL = "jdbc:mysql://localhost:3306/colegio";
        private static final String USER = "root";
        private static final String PASSWORD = "";

        public static Connection getConexion() throws SQLException {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }
    }

