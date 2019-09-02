package car;

import Engine.*;

public class Locomotive extends AbstractCar {
    private int coalVolume;
    private int waterVolume;
    private int speed;
    private ExternalCombustionEngine engine;

    public Locomotive(String producer, String model, int maxSpeed, String transmission, String bodyType, String color, int coalVolume, int waterVolume, int speed, ExternalCombustionEngine engine) {
        super(producer, model, maxSpeed, transmission, bodyType, color);
        this.coalVolume = coalVolume;
        this.waterVolume = waterVolume;
        this.speed = speed;
        this.engine = engine;
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
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
