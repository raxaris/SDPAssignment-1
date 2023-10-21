package Decorator.EngineComponents;

import Decorator.IEngine;

public class ExhaustSystemDecorator extends EngineComponents{

    public ExhaustSystemDecorator(IEngine iEngine) {
        super(iEngine, 150, 30);
    }

    @Override
    public String getDesctiption() {
        return super.getDesctiption() + ", with swapped exhaust system";
    }

}
