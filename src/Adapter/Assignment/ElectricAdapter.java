package Adapter.Assignment;

public class ElectricAdapter implements GasolineCar{
    ElectricCar electricCar;
    ElectricAdapter(ElectricCar electricCar){
        this.electricCar = electricCar;
    }
    @Override
    public void drive() {
        electricCar.drive();
    }

    @Override
    public void fillFuel(float volume) {
        electricCar.charge(volume);
    }

    @Override
    public void park() {
        electricCar.autoPark();
    }

    @Override
    public void gasolineLeft() {
        electricCar.batteryLeft();
    }

    @Override
    public void chargeAccumulator(float time, float power) {
        electricCar.charge(time, power);
    }
}
