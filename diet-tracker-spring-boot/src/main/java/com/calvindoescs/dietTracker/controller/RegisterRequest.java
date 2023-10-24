package com.calvindoescs.dietTracker.controller;

public class RegisterRequest {
    private String email;
    private String password;

    public RegisterRequest() {
    }

    public RegisterRequest(String email, String password) {

        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "RegisterRequest{" +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
