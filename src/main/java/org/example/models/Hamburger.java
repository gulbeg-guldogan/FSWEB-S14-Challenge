package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public  Hamburger(){};

    public Hamburger(String name, double price, String breadRollType){
        this.name = name;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price){
        addition1Name = name;
        addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price){
        addition2Name = name;
        addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price){
        addition3Name = name;
        addition3Price = price;
    }

    public double itemizeHamburger(){
        System.out.println(addition1Name + " " + addition2Name + " " + addition3Name);
        setPrice(price + addition1Price + addition2Price + addition3Price);
        return price + addition1Price + addition2Price + addition3Price;
    }
}
