package com.davidschrik;

public class Hamburger {
    private String name;
    private String meat;
    private String breadType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;
    private double price;

    public Hamburger(String name, String meat, String breadType) {
        this.name = name;
        this.meat = meat;
        this.breadType = breadType;
        this.addition1Name = "";
        this.addition1Price = 0.0;
        this.addition2Name = "";
        this.addition2Price = 0.0;
        this.addition3Name = "";
        this.addition3Price = 0.0;
        this.addition4Name = "";
        this.addition4Price = 0.0;
        this.price = 5.00;
    }

    public void setAddition1(String addition1Name, double addition1Price) {
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
    }

    public void setAddition2(String addition2Name, double addition2Price) {
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }
    public void setAddition3(String addition3Name, double addition3Price) {
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
    }



    public void setAddition4(String addition4Name, double addition4Price) {
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calcPrice(){
        price = this.price;
        price += addition1Price;
        price += addition2Price;
        price += addition3Price;
        price += addition4Price;
        setPrice(price);
        return price;

    }

    public double getPrice() {
        return price;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public double getAddition4Price() {
        return addition4Price;
    }
}
