package com.company.myapp.Factory;

public class ASStyleToyota extends Car{
    public ASStyleToyota(){
        brand = "AS assembled Toyota";
        HP = 170;
        price = 40000;
    }

    @Override
    public void prepareCar() {
        System.out.println("Polishing the car");
    }
}
