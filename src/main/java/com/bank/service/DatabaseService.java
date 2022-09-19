package com.bank.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseService {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/bank";

    private Connection connection;

    public DatabaseService() {
        this.connection = null;
    }

    public Connection getConnection() {
        return connection;
    }

    public void printConnect() throws SQLException {
        // create a connection object
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        // print the connection status
        if (connection != null) {
            System.out.println("\u001B[32m Connected SuccessFully\u001B[0m");
        } else System.out.println("Connection Failed");
    }
}