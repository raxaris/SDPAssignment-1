public class ECUDecorator extends EngineComponents{
    public ECUDecorator(IEngine iEngine){
        super(iEngine);
    }

    @Override
    public double getHorsePower() {
        return super.getHorsePower() + 15;
    }

    @Override
    public double getCost() {
        return super.getCost() + 50;
    }

    @Override
    public String getDesctiption() {
        return super.getDesctiption() + ", with programmed Electronic Control Unit";
    }
}
