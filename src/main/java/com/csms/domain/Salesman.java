package com.csms.domain;

public class Salesman {
    String sale_id;
    String sale_name;
    String sale_username;
    String sale_password;
    String sale_sex;
    int sale_phone;

    public Salesman() {
    }

    public String getSale_id() {
        return sale_id;
    }

    public void setSale_id(String sale_id) {
        this.sale_id = sale_id;
    }

    public String getSale_name() {
        return sale_name;
    }

    public void setSale_name(String sale_name) {
        this.sale_name = sale_name;
    }

    public String getSale_username() {
        return sale_username;
    }

    public void setSale_username(String sale_username) {
        this.sale_username = sale_username;
    }

    public String getSale_password() {
        return sale_password;
    }

    public void setSale_password(String sale_password) {
        this.sale_password = sale_password;
    }

    public int getSale_phone() {
        return sale_phone;
    }

    public void setSale_phone(int sale_phone) {
        this.sale_phone = sale_phone;
    }

    public String getSale_sex() {
        return sale_sex;
    }

    public void setSale_sex(String sale_sex) {
        this.sale_sex = sale_sex;
    }

    @Override
    public String toString() {
        return "Salesman{" +
                "sale_id='" + sale_id + '\'' +
                ", sale_name='" + sale_name + '\'' +
                ", sale_username='" + sale_username + '\'' +
                ", sale_password='" + sale_password + '\'' +
                ", sale_sex='" + sale_sex + '\'' +
                ", sale_phone=" + sale_phone +
                '}';
    }
}
