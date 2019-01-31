package com.davidschrik;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


//        Hamburger hamburger = new Hamburger("Dave", "beef", "white");
//
//        int addCnt = 3;
//        if (addCnt >= 1) {
//            hamburger.setAddition1("lettuce", .50);
//            System.out.println("added " + hamburger.getAddition1Name() + " for $" + hamburger.getAddition1Price());
//        }
//
//        if (addCnt >=2) {
//            hamburger.setAddition2("pickle", .25);
//            System.out.println("added " + hamburger.getAddition2Name() + " for $" + hamburger.getAddition2Price());
//        }
//        if (addCnt >=3) {
//            hamburger.setAddition3("cheeze", 1.00);
//            System.out.println("added " + hamburger.getAddition3Name() + " for $" + hamburger.getAddition3Price());
//        }
//        if (addCnt >=4) {
//            hamburger.setAddition4("bacon", 1.25);
//            System.out.println("added " + hamburger.getAddition4Name() + " for $" + hamburger.getAddition4Price());
//        }
//
//        System.out.println("total price is " + hamburger.getPrice());

//        HealthyBurger healthyBurger = new HealthyBurger("joe", "chicken");
//        healthyBurger.setAddition1("lettuce", .50);
//        healthyBurger.setAddition2("pickle", .25);
//        healthyBurger.setAddition3("cheeze", 1.00);
//        healthyBurger.setAddition4("bacon", 1.25);
//        healthyBurger.setAddition5("avacado", .75);
//        healthyBurger.setAddition6("tofu", .01);
//
//        System.out.println("total price is " + healthyBurger.calcPrice());

        DeluxeBurger deluxeBurger = new DeluxeBurger("deluxe", "beef", "white");

        System.out.println("total price is " + deluxeBurger.calcPrice());
    }
}
