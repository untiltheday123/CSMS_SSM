package com.csms.domain;


//数据报表
public class Profile {
    private Double value;
    private String name;
    private String sale_id;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSale_id() {
        return sale_id;
    }

    public void setSale_id(String sale_id) {
        this.sale_id = sale_id;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "value=" + value +
                ", name='" + name + '\'' +
                ", sale_id='" + sale_id + '\'' +
                '}';
    }
}
