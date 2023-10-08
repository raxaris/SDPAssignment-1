package Decorator;

import Decorator.Engine.*;
import Decorator.EngineComponents.*;

import java.util.Scanner;

public class ConsoleApplication {
    private final Scanner scanner;

    public ConsoleApplication() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        IEngine myEngine = null;
        System.out.println("Welcome to the engine assembly configurator");
        while (true) {
            System.out.println("");
            System.out.println("Select option: ");
            System.out.println("1. Create new engine.");
            System.out.println("2. Modify engine");
            System.out.println("3. My engine");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    myEngine = createEngineMenu();
                    break;
                case 2:
                    myEngine = modifyEngineMenu(myEngine);
                    break;
                case 3:
                    showEngineMenu(myEngine);
                    break;
                case 0:
                    System.out.println("Good bye!");
                    return;
                default:
                    System.out.println("Wrong choice, try again.");
            }
        }
    }

    private IEngine createEngineMenu() {
        Engine.EngineType engineType = chooseET();
        int cylinders = chooseCylinderCount();
        double volume = chooseVolume();
        int EF = chooseEF(cylinders);
        IEngine customEngine = createCustomEngine(engineType, cylinders, volume, EF);
        showEngineMenu(customEngine);
        return customEngine;
    }

    private IEngine modifyEngineMenu(IEngine engine) {
        if (engine == null) {
            System.out.println("Oops, you don't have any engine to modify yet :(");
            return engine;
        }

        IEngine modifiedEngine = engine;

        System.out.println("");
        System.out.println("What do you want to add? ");
        System.out.println("1. Turbo charger.");
        System.out.println("2. Electronic control unit");
        System.out.println("3. Exhaust system");
        System.out.println("4. Injection system");
        System.out.println("0. Exit");
        System.out.println("");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                if (engine instanceof TurboChargerDecorator) {
                    System.out.println("Turbo charger is already added.");
                } else {
                    modifiedEngine = new TurboChargerDecorator(engine);
                }
                break;
            case 2:
                if (engine instanceof ECUDecorator) {
                    System.out.println("ECU is already programmed.");
                } else {
                    modifiedEngine = new ECUDecorator(engine);
                }
                break;
            case 3:
                if (engine instanceof ExhaustSystemDecorator) {
                    System.out.println("Exhaust system is already upgraded");
                } else {
                    modifiedEngine = new ExhaustSystemDecorator(engine);
                }
                break;
            case 4:
                if (engine instanceof InjectionSystemDecorator) {
                    System.out.println("Injection system is already upgraded");
                } else {
                    modifiedEngine = new InjectionSystemDecorator(engine);
                }
                break;
            case 0:
                modifiedEngine = engine;
                break;
            default:
                System.out.println("Wrong choice, try again.");
        }
        showEngineMenu(modifiedEngine);
        return modifiedEngine;
    }

    private void showEngineMenu(IEngine engine){
        if(engine != null){
            System.out.println("Your engine:");
            System.out.println(engine.getDesctiption());
            System.out.println("Power(HP): " + engine.getHorsePower());
            System.out.println("Cost: " + engine.getCost());
        } else {
            System.out.println("Oops, you dont have any yet :(");
        }
    }

    private double chooseVolume() {
        double volume;
        while (true) {
            System.out.println("Volume (between 1.0 and 8.0): ");
            volume = scanner.nextDouble();
            if (volume >= 1.0 && volume <= 8.0) {
                break;
            }
            System.out.println("We cannot build this engine, please enter a value between 1.0 and 8.0.");
        }
        return volume;
    }

    private int chooseCylinderCount() {
        int c;
        while (true) {
            System.out.println("Amount of cylinders (between 4 and 12): ");
            c = scanner.nextInt();
            if (c >= 4 && c <= 12) {
                break;
            }
            System.out.println("We cannot build this engine, please enter a value between 4 and 12.");
        }
        return c;
    }

    private Engine.EngineType chooseET() {
        Engine.EngineType engineType = null;
        while (true){
            System.out.println("What engine type you prefer: ");
            System.out.println("1. Gasoline");
            System.out.println("2. Diesel");
            int answer = scanner.nextInt();
            switch (answer) {
                case 1:
                    engineType = Engine.EngineType.Gasoline;
                    return engineType;
                case 2:
                    engineType = Engine.EngineType.Diesel;
                    return engineType;
                default:
                    System.out.println("Wrong choice, try again.");
            }
        }
    }

    private int chooseEF(int c) {
        int answer = 0;
        if (c <= 6) {
            while (true) {
                System.out.println("What engine form do you prefer: ");
                System.out.println("1. V-type");
                System.out.println("2. In-line");
                answer = scanner.nextInt();
                if (answer == 1 || answer == 2) {break;} else {System.out.println("Wrong choice, try again.");}
            }
        } else {answer = 1;}
        return answer;
    }

    private IEngine createCustomEngine(Engine.EngineType ET, int cylinders, double volume, int EF){
        IEngine customEngine = null;
        switch (EF) {
            case 1: customEngine = new VTypeEngine(ET,cylinders,volume);
                break;
            case 2: customEngine = new InLineEngine(ET,cylinders,volume);
                break;
        }
        return customEngine;
    }
    public static boolean isTurboCharged(IEngine engine) {
        if (engine instanceof TurboChargerDecorator) {
            return true;
        } else if (engine instanceof EngineComponents) {
            return isTurboCharged(((EngineComponents) engine));
        } else {
            return false;
        }
    }
}
