package com.hongzi;


public class DeluxeBurger extends Burger {
    public DeluxeBurger() {
        super("deluxe", "honeyoat", "bacon and beef", 15.0);
        super.add1("drink", 2.00);
        super.add2("chips", 2.50);
    }

    // prevent subclass from using certain super methods
    @Override
    public void add1(String name, Double price) {
        System.out.println("Can't add additional to deluxe");
    }

    @Override
    public void add2(String name, Double price) {
        System.out.println("Can't add additional to deluxe");
    }

    @Override
    public void add3(String name, Double price) {
        System.out.println("Can't add additional to deluxe");
    }

    @Override
    public void add4(String name, Double price) {
        System.out.println("Can't add additional to deluxe");
    }
}
