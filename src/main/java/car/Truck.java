package car;

import engine.*;

public class Truck extends AbstractCar {
    private int fuelVolume;
    private Engine engine;
    private int carryingCapacity;

    public Truck(String producer, String model, int speed, int maxSpeed, String transmission, String bodyType, String color, Engine engine) {
        super(producer, model, speed, maxSpeed, transmission, bodyType, color, engine);
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
}

