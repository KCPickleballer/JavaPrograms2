package com.davidschrik;

public class HealthyBurger extends Hamburger{
    private String additional5Name;
    private double additional5Price;
    private String additional6Name;
    private double additional6Price;

    public HealthyBurger(String name, String meat) {
        super(name, meat, "brown rye");
        this.additional5Name = "";
        this.additional5Price = 0.0;
        this.additional6Name = "";
        this.additional6Price = 0.0;
    }

    @Override
    public double calcPrice() {
        double price = super.calcPrice();
        price += additional5Price;
        price += additional6Price;
        super.setPrice(price);
        return price;
    }

    public void setAddition5(String additional5Name, double additional5Price) {
        this.additional5Name = additional5Name;
        this.additional5Price = additional5Price;
    }

    public void setAddition6(String additional6Name, double additional6Price) {
        this.additional6Name = additional6Name;
        this.additional6Price = additional6Price;
    }


    public String getAdditional5Name() {
        return additional5Name;
    }

    public double getAdditional5Price() {
        return additional5Price;
    }

    public String getAdditional6Name() {
        return additional6Name;
    }

    public double getAdditional6Price() {
        return additional6Price;
    }
}
