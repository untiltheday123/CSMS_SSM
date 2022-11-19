package com.csms.domain;

public class Manager {
    String username;
    String password;

    public Manager(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
