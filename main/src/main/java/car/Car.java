package car;

import java.util.*;

public class Car extends AbstractCar {
    private String interior;
    private int numberSeats;
    private ArrayList<String> additionOptions;
    private int fuelVolume;

    public Car(String producer, String model, int maxSpeed, String transmission, String bodyType, String color) {
        super(producer, model, maxSpeed, transmission, bodyType, color);
    }

    @Override
    public float calculatePrice() {
        int interiorBasePrise;
        if (interior.contains("default")) {
            interiorBasePrise = 0;
        }
        if (interior.contains("велюр")) {
            interiorBasePrise = 1000;
        }
        if (interior.contains("кожа")) {
            interiorBasePrise = 2000;
        } else {
            interiorBasePrise = 500;
        }

        int numberSeatsBasePrice;
        if (numberSeats <= 5) {
            numberSeatsBasePrice = 0;
        } else {
            numberSeatsBasePrice = 500;
        }

        int optionsBasePrice = 400;
        int numberOptions = this.additionOptions.size();
        float price;
        price = super.calculatePrice() + interiorBasePrise + numberSeatsBasePrice + optionsBasePrice * numberOptions;
        return price;
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
        this.fuelVolume += volume;
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

}
