package car;

import java.util.*;

public class CarBuilder {

    private Car newCar;

    public CarBuilder() {
        newCar = new Car("default", "default", 0, "default", "default", "default");
        newCar.setInterior("default");
        newCar.setNumberSeats(5);
        ArrayList<String> arr = new ArrayList();
        newCar.setAdditionOptions(arr);
    }

    public CarBuilder producer(String producer) {
        newCar.setProducer(producer);
        return this;
    }

    public CarBuilder model(String model) {
        newCar.setModel(model);
        return this;
    }

    public CarBuilder maxSpeed(int maxSpeed) {
        newCar.setMaxSpeed(maxSpeed);
        return this;
    }

    public CarBuilder transmission(String transmission) {
        newCar.setTransmission(transmission);
        return this;
    }

    public CarBuilder bodyType(String bodyType) {
        newCar.setBodyType(bodyType);
        return this;
    }

    public CarBuilder color(String color) {
        newCar.setColor(color);
        return this;
    }

    public CarBuilder interior(String interior) {
        newCar.setInterior(interior);
        return this;
    }

    public CarBuilder numberSeats(int number) {
        newCar.setNumberSeats(number);
        return this;
    }

    public CarBuilder add(String option) {
        newCar.addOption(option);
        return this;
    }

    public Car build() {
        return newCar;
    }

}
