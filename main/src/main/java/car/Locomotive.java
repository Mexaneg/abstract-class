package car;

import engine.*;

public class Locomotive extends AbstractCar {
    private int coalVolume;
    private int waterVolume;


    public Locomotive(String producer, String model, int maxSpeed, String transmission, String bodyType, String color, int coalVolume, int waterVolume, int speed, Engine engine) {
        super(producer, model, speed, maxSpeed, transmission, bodyType, color, engine);
        this.coalVolume = coalVolume;
        this.waterVolume = waterVolume;
    }

    @Override
    public void openHood() {
        System.out.println("Открыть люк");
    }

    @Override
    public void closeHood() {
        System.out.println("Закрыть люк");
    }

    @Override
    public void refuel(int volume) {
        coalVolume += volume;

    }

    public void addWater(int volume) {
        waterVolume += volume;
    }

    @Override
    public void accelerate() {
        System.out.println("Паровоз разгоняется");
    }

    @Override
    public void brake() {
        System.out.println("Паровоз тормозит");
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }
}
