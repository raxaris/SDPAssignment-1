package Adapter.Assignment;

public class GasolineAdapter implements ElectricCar{
    GasolineCar gasolineCar;
    GasolineAdapter(GasolineCar gasolineCar){
        this.gasolineCar = gasolineCar;
    }

    @Override
    public void drive() {
        gasolineCar.drive();
    }

    @Override
    public void charge(float time, float chargingStationPower) {
        gasolineCar.chargeAccumulator(time,chargingStationPower);
    }
    public void charge(float volume){
        gasolineCar.fillFuel(volume);
    }

    @Override
    public void autoPark() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void batteryLeft() {
        gasolineCar.gasolineLeft();
    }
}
