package com.company.myapp.Factory;

public class EUStyleBMW extends Car{
    public EUStyleBMW(){
        brand = "EU assembled BMW";
        HP = 250;
        price = 120000;
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
