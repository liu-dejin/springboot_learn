package com.kis2;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.brand = "小米";
        p.price = 1998.99;

        //获取对象的值
        System.out.println(p.brand);
        System.out.println(p.price);

        p.call();
        p.playGame();


    }
}


