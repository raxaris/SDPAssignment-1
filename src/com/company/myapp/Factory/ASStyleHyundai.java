package com.company.myapp.Factory;

public class ASStyleHyundai extends Car{
    public ASStyleHyundai(){
        brand = "AS assembled Hyundai";
        HP = 150;
        price = 20000;
    }

    @Override
    public void prepareCar() {
        System.out.println("Polishing the car");
    }
}
