package Decorator.Engine;

public class InLineEngine extends Engine {

    public InLineEngine(EngineType engineType, int cylinders, double volume) {
        super(engineType, cylinders, volume, 1200 + volume*50 , cylinders*20 + volume*20);
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
        return super.getDesctiption() + " In-line engine";
    }
}
