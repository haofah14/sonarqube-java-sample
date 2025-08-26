package com.uob;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloBank {

    public void login(String userInput) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:h2:mem:testdb");
        Statement stmt = conn.createStatement();

        // BUG + VULNERABILITY: SQL Injection
        String query = "SELECT * FROM users WHERE username = '" + userInput + "'";
        stmt.executeQuery(query);
    }
}
