package com.company.myapp.Factory;

public abstract class Car {
    String brand;
    double HP;
    double price;

    public void prepareCar(){
        System.out.println("Preparing " + brand);
    }
    public void customize(){
        System.out.println("Customizing car");
    }
    public void calculatePrice(){
        System.out.println("Car price: " + price + "$");
    }

    public void calculateHP(){
        System.out.println("Car power: " + HP + " HP");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
