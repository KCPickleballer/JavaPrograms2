package com.davidschrik;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger(String name, String meat, String breadType) {
        super(name, meat, breadType);
        setAddition1("drink", 1.00);
        setAddition2("chips", 1.00);

    }

    @Override
    public void setAddition1(String addition1Name, double addition1Price) {
        super.setAddition1(addition1Name, addition1Price);
    }

    @Override
    public void setAddition2(String addition2Name, double addition2Price) {
        super.setAddition2(addition2Name, addition2Price);
    }

    @Override
    public void setAddition4(String addition4Name, double addition4Price) {
        super.setAddition4("", 0.0);
    }

    @Override
    public void setAddition3(String addition3Name, double addition3Price) {
        super.setAddition3("", 0.0);
    }

    @Override
    public double calcPrice() {

        double price = getPrice();
        price += getAddition1Price();
        System.out.println("addition1 = " + getAddition1Name() + " for " + getAddition1Price());
        price += getAddition2Price();
        System.out.println("addition2 = " + getAddition2Name() + " for " + getAddition2Price());


        return price;

    }
}
