package com.company.myapp.Factory;

public class AqtauCarShowRoom extends CarShowRoom{
    @Override
    public Car createCar(String brand){
        System.out.println("Assembling car");
        switch (brand) {
            case "BMW":
                return new EUStyleBMW();
            case "Toyota":
                return new EUStyleToyota();
            case "Hyundai":
                return new EUStyleHyundai();
            default:
                return null;
        }
    }
}
