package com.csms.controller;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Double> price = new ArrayList<>();
        price.add(18.3);
        price.add(200.0);
        price.add(67.91);
        price.add(345.05);
        price.add(100.00);

        List<Integer> num = new ArrayList<>();
        num.add(0);
        num.add(0);
        num.add(0);
        num.add(6);
        num.add(3);

        List<Double> total = new ArrayList<>();
        total.add(price.get(0)* num.get(0));
        total.add(price.get(1)* num.get(1));
        total.add(price.get(2)* num.get(2));
        total.add(price.get(3)* num.get(3));
        total.add(price.get(4)* num.get(4));

        double tttt = 0.0;
        for (Double tt : total) {
            tttt+=tt;
            System.out.println(tt);
        }
        System.out.println("total="+tttt);
    }
}
