package com.csms.domain;

public class GoodsByOrderId {
    private String pro_name;
    private String pro_detail;
    private Float pro_price;
    private int pro_num;
    private Float pro_total;
    private String order_state;
    private String pro_url;


    public GoodsByOrderId() {
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    public String getPro_detail() {
        return pro_detail;
    }

    public void setPro_detail(String pro_detail) {
        this.pro_detail = pro_detail;
    }

    public Float getPro_price() {
        return pro_price;
    }

    public void setPro_price(Float pro_price) {
        this.pro_price = pro_price;
    }

    public int getPro_num() {
        return pro_num;
    }

    public void setPro_num(int pro_num) {
        this.pro_num = pro_num;
    }

    public Float getPro_total() {
        return pro_total;
    }

    public void setPro_total(Float pro_total) {
        this.pro_total = pro_total;
    }

    public String getOrder_state() {
        return order_state;
    }

    public void setOrder_state(String order_state) {
        this.order_state = order_state;
    }

    public String getPro_url() {
        return pro_url;
    }

    public void setPro_url(String pro_url) {
        this.pro_url = pro_url;
    }
}
