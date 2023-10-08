package Decorator.EngineComponents;

import Decorator.IEngine;

public class ECUDecorator extends EngineComponents {
    public ECUDecorator(IEngine iEngine) {
        super(iEngine, 200, 20);
    }

    @Override
    public String getDesctiption() {
        return super.getDesctiption() + ", with programmed Electronic Control Unit";
    }
}
