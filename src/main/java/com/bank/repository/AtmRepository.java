package com.bank.repository;

import java.sql.Connection;

public class AtmRepository {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/bank";

    private Connection connection;

    public AtmRepository() {
        this.connection = null;
    }
}
