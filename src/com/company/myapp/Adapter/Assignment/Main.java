package com.company.myapp.Adapter.Assignment;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("");
            System.out.println("Assignment-3 Menu. Make a choice.");
            System.out.println("1. Check Ford Mustang class (Adaptee)");
            System.out.println("2. Check Tesla Model S class (Target)");
            System.out.println("3. Check Adapter1");
            System.out.println("4. Check Adapter2");
            System.out.println("0. Exit");
            int answer = scanner.nextInt();
            switch (answer) {
                case 1:
                    System.out.println("Mustang");
                    GasolineCar mustang = new FordMustang(20, "V8");
                    mustang.drive();
                    mustang.park();
                    mustang.gasolineLeft();
                    mustang.fillFuel(50);
                    break;

                case 2:
                    System.out.println("Tesla:");
                    ElectricCar tesla = new TeslaModelS(0);
                    tesla.drive();
                    tesla.autoPark();
                    tesla.batteryLeft();
                    tesla.charge(6480, 100);
                    break;

                case 3:
                    System.out.println("Abstract case: I am an employee who is working on a game which has only electric vehicles");
                    System.out.println("and using only ElectricCar interface. Our company collaborated with other game and they ");
                    System.out.println("want us to add their gasoline cars, but our program cant work with GasolineCars interface");
                    System.out.println("I need to complete this task in short terms, and my boss told me to not change our code ");
                    System.out.println("and our partner's code, so I made an adapter to work with gasoline cars with our Electric car interface");
                    System.out.println();
                    System.out.println("com.company.myapp.Factory.Observer.Adapter:");
                    System.out.println("Mustang that wanted to be a Tesla");
                    GasolineCar dreamerMustang = new FordMustang(20, "6.6L 8-cylinder V-type");
                    ElectricCar mustangAdapter = new GasolineAdapter(dreamerMustang);
                    mustangAdapter.drive();
                    mustangAdapter.batteryLeft();
                    mustangAdapter.charge(100);
                    mustangAdapter.autoPark();
                    break;

                case 4:
                    System.out.println("Reversed case");
                    System.out.println();
                    System.out.println("com.company.myapp.Factory.Observer.Adapter:");
                    System.out.println("Tesla that wanted to be a Mustang");
                    ElectricCar dreamerTesla = new TeslaModelS(100);
                    GasolineCar teslaAdapter = new ElectricAdapter(dreamerTesla);
                    teslaAdapter.drive();
                    teslaAdapter.gasolineLeft();
                    teslaAdapter.fillFuel(100);
                    teslaAdapter.park();
                    teslaAdapter.chargeAccumulator(3600,100);
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Error, try again.");
                    break;
            }
        }
    }
}
