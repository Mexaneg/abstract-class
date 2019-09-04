package car;

import Engine.*;

public class Truck extends AbstractCar {
    private int speed;
    private int fuelVolume;
    private Engine engine;
    private int carryingCapacity;

    public Truck(String producer, String model, int maxSpeed, String transmission, String bodyType, String color) {
        super(producer, model, maxSpeed, transmission, bodyType, color);
    }

    @Override
    public float calculatePrice() {
        int carryingCapacityPriceFactor = 10;
        float price = 0;
        price = super.calculatePrice() + engine.calculatePrice() + carryingCapacityPriceFactor * carryingCapacity;
        return price;
    }

    public int getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(int fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public void openHood() {
        System.out.println("Поднять кабину");
    }

    @Override
    public void closeHood() {
        System.out.println("Опустить кабину");
    }

    @Override
    public void refuel(int volume) {
        fuelVolume = volume;
    }

    @Override
    public void accelerate() {
        System.out.println("Грузовик разгоняется");
    }

    @Override
    public void brake() {
        System.out.println("Грузовик тормозит");
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
