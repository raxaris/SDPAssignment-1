package Decorator.EngineComponents;

import Decorator.IEngine;

public class TurboChargerDecorator extends EngineComponents {
    public TurboChargerDecorator(IEngine iEngine) {
        super(iEngine, 400, 50);
    }

    @Override
    public String getDesctiption() {
        return super.getDesctiption() + ", with turbocharger installed";
    }
}
