package com.csms.domain;

public class User {
    String user_id;
    String sale_id;
    String user_name;
    String user_username;
    String user_password;
    String user_address;
    String user_sex;
    String user_phone;

    public String getUser_username() {
        return user_username;
    }

    public void setUser_username(String user_username) {
        this.user_username = user_username;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public String getSale_id() {
        return sale_id;
    }

    public void setSale_id(String sale_id) {
        this.sale_id = sale_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id='" + user_id + '\'' +
                ", sale_id='" + sale_id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_username='" + user_username + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_address='" + user_address + '\'' +
                ", user_sex='" + user_sex + '\'' +
                ", user_phone=" + user_phone +
                '}';
    }
}
