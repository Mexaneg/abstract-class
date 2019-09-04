package engine;

import java.util.*;

public abstract class AbstractEngine implements Engine {
    private int power;
    private int cylinderAmount;
    private String controlSystem;
    private ArrayList<String> errors;
    private String state;
    private float fuelConsumption;

    public AbstractEngine(int power, int cylinderAmount, String controlSystem, ArrayList<String> errors, String state, float fuelConsumption) {
        this.power = power;
        this.cylinderAmount = cylinderAmount;
        this.controlSystem = controlSystem;
        this.errors = errors;
        this.state = state;
        this.fuelConsumption = fuelConsumption;
    }

    public abstract void run();

    public abstract void stop();

    public ArrayList<String> getErrors() {
        return errors;
    }

    public void cleanErrors() {
        errors.clear();
    }

    public float calculatePrice() {
        int basePrice = 10;
        int cylinderAmountPriceFactor = (cylinderAmount / 4);
        int controlSystemBasePrice = 0;

        switch (controlSystem) {
            case "MPI":
                controlSystemBasePrice = 500;
            case "FSI":
                controlSystemBasePrice = 1000;
            case "TFSI":
                controlSystemBasePrice = 3000;
            default:
                controlSystemBasePrice = 250;
        }

        float price = 0;
        price = basePrice * power * cylinderAmountPriceFactor + controlSystemBasePrice;
        return price;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getControlSystem() {
        return controlSystem;
    }

    public void setControlSystem(String controlSystem) {
        this.controlSystem = controlSystem;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractEngine)) return false;
        AbstractEngine that = (AbstractEngine) o;
        return power == that.power &&
                cylinderAmount == that.cylinderAmount &&
                Float.compare(that.fuelConsumption, fuelConsumption) == 0 &&
                Objects.equals(controlSystem, that.controlSystem) &&
                Objects.equals(errors, that.errors) &&
                Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, cylinderAmount, controlSystem, errors, state, fuelConsumption);
    }
}
