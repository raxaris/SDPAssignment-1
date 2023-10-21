package Adapter.Assignment;

public class FordMustang implements GasolineCar{
    private final float tankVolume = 60;
    private float currentVolume;
    private String engineType;

    public FordMustang(float currentVolume, String engineType) {
        this.currentVolume = currentVolume;
        this.engineType = engineType;
    }

    @Override
    public void drive() {
        System.out.println(engineType + " engine sounds");
    }

    @Override
    public void fillFuel(float volume) {
        System.out.print("You filled your Mustang with " + volume + "L of gasoline. ");
        float totalVolume = currentVolume + volume;
        if(totalVolume > tankVolume){
            currentVolume = tankVolume;
            System.out.println("Tank is full, but " + (totalVolume - tankVolume) + " went outside");
        } else {
            currentVolume = totalVolume;
            System.out.println("Current tank volume is: " + totalVolume);
        }
        gasolineLeft();
    }

    @Override
    public void park() {
        System.out.println("Driver manually parks Mustang");
    }

    @Override
    public void gasolineLeft() {
        float kilometresLeft = (currentVolume / 20) * 100;
        System.out.println("Current fuel level: " + currentVolume + "L; " + kilometresLeft + " kilometres left");
    }

    public float getTankVolume() {
        return tankVolume;
    }

    public String getEngineType() {
        return engineType;
    }

    public float getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(float currentVolume) {
        this.currentVolume = currentVolume;
    }
}
