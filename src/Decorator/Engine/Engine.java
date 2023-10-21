package Decorator.Engine;

import Decorator.IEngine;

public abstract class Engine implements IEngine {
    private final int cylinders;
    private double cost;
    private double HP;
    private final double volume;
    private final EngineType engineType;
    public Engine(EngineType engineType, int cylinders, double volume, double cost, double HP){
        this.engineType = engineType;
        this.cylinders = cylinders;
        this.volume = volume;
        this.cost = cost;
        this.HP = HP;
    }

    public enum EngineType{
        Gasoline("Gasoline"),
        Diesel("Diesel");
        private final String description;
        EngineType(String description){
            this.description = description;
        }
    }

    @Override
    public double getHorsePower() {
        return HP;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getDesctiption() {
        return cylinders + "-cylinder " + volume + "L " + engineType.description;
    }
}
