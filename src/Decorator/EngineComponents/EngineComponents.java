package Decorator.EngineComponents;

import Decorator.IEngine;

public abstract class EngineComponents implements IEngine {
    private double componentCost;
    private double componentBoost;
    private final IEngine iEngine;
    public EngineComponents(IEngine iEngine, double componentCost, double componentBoost){
        this.iEngine = iEngine;
        this.componentCost = componentCost;
        this.componentBoost = componentBoost;
    }
    @Override
    public double getHorsePower() {
        return iEngine.getHorsePower() + componentBoost;
    }

    @Override
    public double getCost() {
        return iEngine.getCost() + componentCost;
    }

    @Override
    public String getDesctiption() {
        return iEngine.getDesctiption();
    }
}
