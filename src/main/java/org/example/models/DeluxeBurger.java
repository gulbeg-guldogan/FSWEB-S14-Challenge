package org.example.models;

public class DeluxeBurger extends Hamburger{

    private String cips;
    private String drink;

    public DeluxeBurger() {
        super.setPrice(19.10);
        this.cips = "CURVY";
        this.drink = "COKE";

    }

    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }

    @Override
    public void addHamburgerAddition1(String name, double price){
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price){
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price){
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }
}
