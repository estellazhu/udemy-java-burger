package com.hongzi;


public class HealthyBurger extends Burger {
    private String healthyExtra1;
    private double healthyExtra1Price;

    private String healthyExtra2;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", "oat", meat, price);
    }

    public void addHealthyExtra1(String name, double price) {
        this.healthyExtra1 = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyExtra2(String name, double price) {
        this.healthyExtra2 = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeBurger() {
        double basicBurgerPrice = super.itemizeBurger();
        if (this.healthyExtra1 != null) {
            basicBurgerPrice += this.healthyExtra1Price;
            System.out.println("you added healthy extra: " + this.healthyExtra1);
        }
        if (this.healthyExtra2 != null) {
            basicBurgerPrice += this.healthyExtra2Price;
            System.out.println("you added healthy extra: " + this.healthyExtra2);
        }
        return basicBurgerPrice;
    }
}
