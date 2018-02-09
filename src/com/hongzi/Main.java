package com.hongzi;


public class Main {

    public static void main(String[] args) {
        Burger myBurger = new Burger("basic", "oat", "steak", 3.50);

        myBurger.add1("lettuce", 0.60);
        myBurger.add2("green peper", 0.70);
        System.out.println("My burger total price is " + myBurger.itemizeBurger());

        HealthyBurger myHBurger = new HealthyBurger("chicken", 3.00);

        myHBurger.add1("tomato", 0.50);
        myHBurger.addHealthyExtra1("nuts",1.60);
        System.out.println("My healthy burger total price is " + myHBurger.itemizeBurger());

        DeluxeBurger myDB = new DeluxeBurger();
        myDB.add1("lettuce", 0.60);
        System.out.println("My deluxe burger total price is " + myDB.itemizeBurger());

    }


}


