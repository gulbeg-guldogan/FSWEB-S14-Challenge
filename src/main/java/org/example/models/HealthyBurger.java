package org.example.models;

public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, price, breadRollType);
        super.setMeat("Tofu");
    }

    public void addHealthyAddition1(String name, double price){
        healthyExtra1Name = name;
        healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price){
        healthyExtra2Name = name;
        healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        System.out.println(healthyExtra1Name + " " + healthyExtra2Name);
        super.setPrice(super.getPrice() + healthyExtra2Price + healthyExtra1Price);
        return super.getPrice() + healthyExtra2Price + healthyExtra1Price;
    }
}
