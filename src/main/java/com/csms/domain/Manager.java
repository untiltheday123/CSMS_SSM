package com.csms.domain;

public class Manager {
    String mana_name;
    String mana_username;
    String mana_password;
    String mana_id;

    public String getMana_name() {
        return mana_name;
    }

    public void setMana_name(String mana_name) {
        this.mana_name = mana_name;
    }

    public String getMana_username() {
        return mana_username;
    }

    public void setMana_username(String mana_username) {
        this.mana_username = mana_username;
    }

    public String getMana_password() {
        return mana_password;
    }

    public void setMana_password(String mana_password) {
        this.mana_password = mana_password;
    }

    public String getMana_id() {
        return mana_id;
    }

    public void setMana_id(String mana_id) {
        this.mana_id = mana_id;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "mana_name='" + mana_name + '\'' +
                ", mana_username='" + mana_username + '\'' +
                ", mana_password='" + mana_password + '\'' +
                ", mana_id='" + mana_id + '\'' +
                '}';
    }
}
