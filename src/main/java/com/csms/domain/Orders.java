package com.csms.domain;

public class Orders {
    String order_id;
    String order_time;
    String order_state;
    Float order_total;
    String sale_id;
    String user_id;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getOrder_time() {
        return order_time;
    }

    public void setOrder_time(String order_time) {
        this.order_time = order_time;
    }

    public String getOrder_state() {
        return order_state;
    }

    public void setOrder_state(String order_state) {
        this.order_state = order_state;
    }

    public Float getOrder_total() {
        return order_total;
    }

    public void setOrder_total(Float order_total) {
        this.order_total = order_total;
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

    @Override
    public String toString() {
        return "OrderBySalesman{" +
                "order_id='" + order_id + '\'' +
                ", order_time='" + order_time + '\'' +
                ", order_state='" + order_state + '\'' +
                ", order_total=" + order_total +
                ", sale_id='" + sale_id + '\'' +
                ", user_id='" + user_id + '\'' +
                '}';
    }
}
