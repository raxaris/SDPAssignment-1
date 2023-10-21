package Adapter.Assignment;

public class TeslaModelS implements ElectricCar{
    private final float batteryCapacity = 500; //KWt*h
    private float currentKWH;

    public TeslaModelS(float currentKWH) {
        this.currentKWH = currentKWH;
    }

    @Override
    public void drive() {
        System.out.println("No sound");
    }

    @Override
    public void charge(float time, float chargingStationPower) {
        System.out.println("Current KWH: " + currentKWH);
        System.out.println("Starting charging");
        int timeLeft = 0;

        double chargingSpeed = chargingStationPower / 3600;

        while(timeLeft < time){
            if(currentKWH >= batteryCapacity){
                System.out.println("Battery is full");
                break;
            } else {
                if(timeLeft % 3600 == 0) {
                    System.out.println("Charging...");
                }
                currentKWH += chargingSpeed;

            }
            //here I wanted to imitate charging process of Tesla, but instead of seconds I sped up to hours
            timeLeft += 1;
        }
        batteryLeft();
    }

    public void charge(float volume){
        currentKWH += volume;
        batteryLeft();
    }
    @Override
    public void autoPark() {
        System.out.println("Autopilot takes control and is parking now");
    }

    @Override
    public void batteryLeft() {
        float kilometresLeft =  currentKWH * 1;
        System.out.println("Current KWH: " + Math.round(currentKWH) + "; " + Math.round(kilometresLeft) + " kilometres left");
    }

    public float getBatteryCapacity() {
        return batteryCapacity;
    }

    public float getCurrentKWH() {
        return currentKWH;
    }
}
