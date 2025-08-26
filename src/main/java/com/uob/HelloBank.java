package com.uob;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HelloBank {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        // VULNERABILITY: Hardcoded password used in authentication
        String password = "SuperSecret123"; // SonarCloud will flag this

        // Using password in an insecure operation triggers Vulnerability
        // Here: insecure MD5 hashing combined with hardcoded password
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] hash = md.digest(password.getBytes());

        // VULNERABILITY: Hardcoded API token (another common trigger)
        String apiToken = "abc123TOKEN"; // SonarCloud flags hardcoded secret
        System.out.println("Login with password hash: " + hash + " and token: " + apiToken);

        System.out.println("Welcome to UOB!");
    }
}
