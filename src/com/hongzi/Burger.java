package com.hongzi;


public class Burger {

    private String name;
    private String bread;
    private String meat;
    private Double price;

    private String add1Name;
    private Double add1Price;

    private String add2Name;
    private Double add2Price;

    private String add3Name;
    private Double add3Price;

    private String add4Name;
    private Double add4Price;

    public Burger(String name, String bread, String meat, Double price) {
        this.name = name;
        this.bread = bread;
        this.meat = meat;
        this.price = price;
    }

    public void add1(String name, Double price) {
        this.add1Name = name;
        this.add1Price = price;
    }

    public void add2(String name, Double price) {
        this.add2Name = name;
        this.add2Price = price;
    }

    public void add3(String name, Double price) {
        this.add3Name = name;
        this.add3Price = price;
    }

    public void add4(String name, Double price) {
        this.add4Name = name;
        this.add4Price = price;
    }

    public double itemizeBurger() {
        double burgerPrice = this.price;
        System.out.println(this.name + "'s start price is " + this.price);

        if (this.add1Name != null) {
            burgerPrice += add1Price;
            System.out.println("you added " + this.add1Name);
        }
        if (this.add2Name != null) {
            burgerPrice += add2Price;
            System.out.println("you added " + this.add2Name);
        }
        if (this.add3Name != null) {
            burgerPrice += add3Price;
            System.out.println("you added " + this.add3Name);
        }
        if (this.add4Name != null) {
            burgerPrice += add4Price;
            System.out.println("you added " + this.add4Name);
        }
        return burgerPrice;
    }
}
