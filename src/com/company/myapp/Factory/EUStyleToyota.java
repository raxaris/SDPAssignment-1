package com.company.myapp.Factory;

public class EUStyleToyota extends Car{
    public EUStyleToyota(){
        brand = "EU assembled Toyota";
        HP = 190;
        price = 50000;
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
