package com.rentas.xzrentcar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectarBD {

    private static final String URL = "jdbc:mysql://localhost:3306/xzrentcar";
    private static final String USER = "renta";
    private static final String PASSWORD = "Rentas2025.";
    private Connection connection;

    public Connection connect() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        System.out.println("Conexión exitosa a la base de datos");
        return connection;
    }

    public void disconnect() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}
