package car;

import java.util.*;

public class Car extends AbstractCar {
    private String interior;
    private int numberSeats;
    private ArrayList<String> additionOptions;

    public Car(String producer, String model, int maxSpeed, String transmission, String bodyType, String color) {
        super(producer, model, maxSpeed, transmission, bodyType, color);
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
    public void addOption(String option){
        this.additionOptions.add(option);
    }


    @Override
    public String toString() {
        return "Car{" +
                "interior='" + interior + '\'' +
                ", numberSeats=" + numberSeats +
                ", additionOptions=" + additionOptions +
                ", "+super.toString()+
                '}';
    }

    @Override
    public void openHood() {

    }

    @Override
    public void closeHood() {

    }

    @Override
    public void refuel(int volume) {

    }

    @Override
    public void accelerate() {

    }

    @Override
    public void brake() {

    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public void setSpeed(int speed) {

    }
}
