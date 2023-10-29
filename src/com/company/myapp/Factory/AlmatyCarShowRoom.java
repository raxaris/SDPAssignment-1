package com.company.myapp.Factory;

public class AlmatyCarShowRoom extends CarShowRoom{
    @Override
    public Car createCar(String brand) {
        System.out.println("Assembling car");
        switch (brand){
            case "BMW":
                return new ASStyleBMW();
            case "Toyota":
                return new ASStyleToyota();
            case "Hyundai":
                return new ASStyleHyundai();
            default:
                return null;
        }
    }
}
