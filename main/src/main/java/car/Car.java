package car;

import java.util.*;

public class Car extends AbstractCar {
    private String interior;
    private int numberSeats;
    private ArrayList<String> additionOptions;
    private int fuelVolume;
    private int speed;

    public Car(String producer, String model, int maxSpeed, String transmission, String bodyType, String color) {
        super(producer, model, maxSpeed, transmission, bodyType, color);
    }

    @Override
    public float calculatePrice() {
        int interiorBasePrise;
        if (interior == "default") {
            interiorBasePrise = 0;
        }
        if (interior == "велюр") {
            interiorBasePrise = 1000;
        }
        if (interior == "кожа") {
            interiorBasePrise = 2000;
        } else {
            interiorBasePrise = 500;
        }

        return super.calculatePrice();
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    public ArrayList<String> getAdditionOptions() {
        return additionOptions;
    }

    public void setAdditionOptions(ArrayList<String> additionOptions) {
        this.additionOptions = additionOptions;
    }

    public void addOption(String option) {
        this.additionOptions.add(option);
    }


    @Override
    public String toString() {
        return "Car{" +
                "interior='" + interior + '\'' +
                ", numberSeats=" + numberSeats +
                ", additionOptions=" + additionOptions +
                ", " + super.toString() +
                '}';
    }

    @Override
    public void openHood() {
        System.out.println("Открыть капот!");
    }

    @Override
    public void closeHood() {
        System.out.println("Закрыть капот!");
    }

    @Override
    public void refuel(int volume) {
        fuelVolume += volume;
        System.out.println("Топливо дозаправлено!");
    }

    @Override
    public void accelerate() {
        System.out.println("Педаль газа нажата - разгоняемся!");
    }

    @Override
    public void brake() {
        System.out.println("Тормози!!!");
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
