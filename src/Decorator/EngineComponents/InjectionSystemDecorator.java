package Decorator.EngineComponents;

import Decorator.IEngine;

public class InjectionSystemDecorator extends EngineComponents{
    public InjectionSystemDecorator(IEngine iEngine) {
        super(iEngine,200, 20 );
    }

    @Override
    public String getDesctiption() {
        return super.getDesctiption() + ", with advanced injection system";
    }
}
