package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        //obj.val = 10;
        //System.out.println(obj.val);
        //java: val has private access in com.driver.RWOnly
        obj.setVal(10);
        System.out.println(obj.getVal());
    }
}