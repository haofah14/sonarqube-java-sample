package com.uob;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HelloBank {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        // VULNERABILITY: Hardcoded password used for hashing
        String password = "SuperSecret123"; // SonarCloud will flag this

        // Using password in hashing triggers Vulnerability
        MessageDigest md = MessageDigest.getInstance("MD5"); // insecure
        byte[] hash = md.digest(password.getBytes());

        System.out.println("Welcome to UOB!");
    }
}
