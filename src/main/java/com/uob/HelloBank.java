package com.uob;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HelloBank {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String password = "abc123"; // Vulnerability: hardcoded password
        System.out.println("Welcome to UOB!");
        System.out.println("Welcome to UOBx!");

        // Vulnerability: using insecure MD5 hashing
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] hash = md.digest(password.getBytes());
    }
}
