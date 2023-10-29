package com.company.myapp.Factory;

public class EUStyleHyundai extends Car{
    public EUStyleHyundai(){
        brand = "EU assembled Hyundai";
        HP = 160;
        price = 22000;
    }

    @Override
    public void prepareCar() {
        System.out.println("Applying polyurethane wrap");
    }
    @Override
    public void customize() {
        System.out.println("Adding EURO-4 firmware");
    }
}
