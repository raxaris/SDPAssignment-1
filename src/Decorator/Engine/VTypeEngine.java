package Decorator.Engine;

import Decorator.Engine.Engine;

public class VTypeEngine extends Engine {

    public VTypeEngine(EngineType engineType, int cylinders, double volume) {
        super(engineType, cylinders, volume, 1600 + volume*60 , cylinders*20 + volume*30);
    }

    @Override
    public double getHorsePower() {
        return super.getHorsePower();
    }

    @Override
    public double getCost() {
        return super.getCost();
    }

    @Override
    public String getDesctiption() {
        return super.getDesctiption() + " V-Type engine";
    }
}
