package com.practice.spring_practice.springconfig.environment;


public class JwtTokenKeyProvider {
    private String secretKey;

    public JwtTokenKeyProvider(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getSecretKey() {
        return secretKey;
    }
}
