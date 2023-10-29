package com.company.myapp.Factory;

public class TestFactory {
    public static void main(String[] args) {
        CarShowRoom almatySR = new AlmatyCarShowRoom();
        CarShowRoom aqtauSR = new AqtauCarShowRoom();

        Car car1 = almatySR.orderCar("BMW");
        System.out.println("Ali ordered " + car1.getBrand());
        System.out.println("");
        Car car2 = aqtauSR.orderCar("BMW");
        System.out.println("Bekmyrza ordered " + car2.getBrand());
    }
}
