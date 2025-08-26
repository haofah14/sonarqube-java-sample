package com.uob;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoanProcessor {
    public void processLoan(String userInput) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "password");
        Statement stmt = conn.createStatement();

        // Vulnerability: SQL Injection
        String query = "SELECT * FROM loans WHERE user='" + userInput + "'";
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            System.out.println("Loan: " + rs.getString("loan_id"));
        }
    }
}
