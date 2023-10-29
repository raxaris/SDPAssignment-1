package com.company.myapp.Adapter.Assignment;

public interface ElectricCar {
    public void drive();
    public void charge(float time, float chargingStationPower);
    public void charge (float volume);
    public void autoPark();
    public void batteryLeft();
}
