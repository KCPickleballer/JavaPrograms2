package com.davidSchrik;

class Car {
    private int engine;
    private int wheels;
    private int cylinders;
    private String name;
    private boolean engineOn;
    private int speed;
    private int maxSpeed;

    public Car() {
        this.engine = 0;
        this.wheels = 0;
        this.cylinders = 0;
        this.name = "Unknown";
        this.engineOn = false;
        this.speed = 0;
        this.maxSpeed = 120;
    }

    public boolean startEngine(){
        System.out.println(" Car -> Car won't start! ");
        this.engineOn = false;
        return false;
    }

    public int accelerate(int acceleration ){
        System.out.println("Car -> acceleration ");
        if (acceleration + this.speed < maxSpeed){
            this.speed += acceleration;
            return this.speed;
        } else return this.maxSpeed;
    }

    public int braking(int brakeLevel){
        System.out.println("Car -> braking ");
        if (this.speed - brakeLevel <= 0){
            this.speed = 0;
            return this.speed;
        } else {
            return (this.speed -= brakeLevel);
        }

    }
    public int getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public boolean isEngineOn() {
        return engineOn;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

}

class HotRod extends Car {

    private int engine;
    private int wheels;
    private int cylinders;
    private String name;
    private boolean engineOn;
    private int speed;
    private int maxSpeed;

    public HotRod() {
        this.engine = 1500;
        this.wheels = 4;
        this.cylinders = 8;
        this.name = "Mustang";
        this.engineOn = false;
        this.speed = 0;
        this.maxSpeed = 200;
    }

    public boolean startEngine() {
        System.out.println(" HotRod -> Engine revved! ");
        this.engineOn = true;
        return true;
    }

    public int accelerate(int acceleration) {
        System.out.println("HotRod -> acceleration ");
        if ((acceleration * 2) + this.speed < maxSpeed) {
            this.speed += (acceleration * 2);
            return this.speed;
        } else return this.maxSpeed;
    }

    public int braking(int brakeLevel) {
        System.out.println("HotRod -> braking ");
        if (this.speed - brakeLevel <= 0) {
            this.speed = 0;
            return this.speed;
        } else {
            return (this.speed -= brakeLevel);
        }

    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}

class Scooter extends Car {

    private int engine;
    private int wheels;
    private int cylinders;
    private String name;
    private boolean engineOn;
    private int speed;
    private int maxSpeed;

    public Scooter() {
        this.engine = 110;
        this.wheels = 2;
        this.cylinders = 2;
        this.name = "Vespa";
        this.engineOn = false;
        this.speed = 0;
        this.maxSpeed = 30;
    }

    public boolean startEngine() {
        System.out.println(" Scooter -> Engine puring! ");
        this.engineOn = true;
        return true;
    }

    public int accelerate(int acceleration) {
        System.out.println("Scooter -> acceleration ");
        if ((acceleration) + this.speed < maxSpeed) {
            this.speed += (acceleration);
            return this.speed;
        } else return this.maxSpeed;
    }

    public int braking(int brakeLevel) {
        System.out.println("Scooter -> braking ");
        if (this.speed - brakeLevel <= 0) {
            this.speed = 0;
            return this.speed;
        } else {
            return (this.speed -= brakeLevel);
        }
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}

class Junker extends Car{
    private int engine;
    private int wheels;
    private int cylinders;
    private String name;
    private boolean engineOn;
    private int speed;
    private int maxSpeed;

    public  Junker() {
        this.engine = 500;
        this.wheels = 3;
        this.cylinders = 4;
        this.name = "Junker";
        this.engineOn = false;
        this.speed = 0;
        this.maxSpeed = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}

public class Main {
    public static void main(String[] args) {
        for (int i =1; i < 6; i++){
            Car car = randomCar();
            System.out.println("car # " + i + car.getName() +
             " going this fast " + car.accelerate(20)       );
        }
    }


    public static Car randomCar(){
        int randomNumber = (int) (Math.random() * 3 + 1);
        System.out.println("rando " + randomNumber);
        switch (randomNumber){
            case 1:
                return new HotRod();
            case 2:
                return new Scooter();
            case 3:
                return new Junker();

        }
        return null;
    }
}

