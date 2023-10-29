package com.company.myapp.Factory;

public abstract class CarShowRoom {
    public Car orderCar(String type){
        Car car = createCar(type);
        car.prepareCar();
        car.customize();
        car.calculatePrice();
        car.calculateHP();
        return car;
    }

     abstract Car createCar(String brand);
}
