package com.uob;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HelloBank {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        // VULNERABILITY: Hardcoded password → security risk if credentials leak
        String password = "abc123";

        System.out.println("Welcome to UOB!");
        System.out.println("Welcome to UOBx!");

        // VULNERABILITY: Using MD5 hashing → insecure, could be exploited
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] hash = md.digest(password.getBytes());
    }
}
