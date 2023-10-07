public class Main {
    public static void main(String[] args) {
        IEngine customEngine = new ECUDecorator(new ExhaustSystemDecorator(new TurboChargerDecorator(new InjectionSystemDecorator(new VTypeEngine(Engine.EngineType.Diesel)))));
        System.out.println(customEngine.getDesctiption());
    }
}