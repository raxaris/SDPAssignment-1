package com.company.myapp.Factory;

public class ASStyleBMW extends Car{
    public ASStyleBMW(){
        brand = "AS assembled BMW";
        HP = 200;
        price = 100000;
    }

    @Override
    public void prepareCar() {
        System.out.println("Polishing the car");
    }
}
