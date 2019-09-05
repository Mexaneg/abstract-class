package car;

import engine.*;

import java.util.*;

public abstract class AbstractCar implements Vehicle {
    private String producer;
    private String model;
    private int speed;
    private int maxSpeed;
    private String transmission;
    private String bodyType;
    private String color;
    private Engine engine;

    public AbstractCar(String producer, String model, int speed, int maxSpeed, String transmission, String bodyType, String color, Engine engine) {
        this.producer = producer;
        this.model = model;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.color = color;
        this.engine = engine;
    }

    public abstract void openHood();

    public abstract void closeHood();

    public abstract void refuel(int volume);

    public abstract void accelerate();

    public abstract void brake();

    public float calculatePrice() {
        float producerBasePrice = 0;
        float transmissionBasePrice = 0;
        float bodyTypePriceFactor = 0;
        float colorPriceFactor = 0;
        float price = 0;
        //producer base price variants
        if (this.producer.equals("BMW")) {
            producerBasePrice = 20000;

        } else if (this.producer.equals("Mercedes")) {
            producerBasePrice = 30000;
        } else if (this.producer.equals("Toyota")) {
            producerBasePrice = 10000;
        } else if (this.producer.equals("Lada")) {
            producerBasePrice = 2000;
        } else {
            producerBasePrice = 5000;
        }

        //transmission base price
        if (this.transmission.equals("MT")) {
            transmissionBasePrice = 1000;
        } else if (this.transmission.equals("AMT")) {
            transmissionBasePrice = 2000;
        } else if (this.transmission.equals("AT")) {
            transmissionBasePrice = 3000;
        } else {
            producerBasePrice = 1500;
        }

        //body type price factors
        if (this.bodyType.equals("sedan")) {
            bodyTypePriceFactor = (float) 1.2;
        } else if (this.bodyType.equals("hatchback")) {
            bodyTypePriceFactor = (float) 1.1;
        } else if (this.bodyType.equals("coupe")) {
            bodyTypePriceFactor = (float) 1.5;
        } else if (this.bodyType.equals("suv")) {
            bodyTypePriceFactor = (float) 2.5;
        } else {
            bodyTypePriceFactor = (float) 1;
        }

        //color price factor
        if (this.color.equals("red")) {
            colorPriceFactor = (float) 1.1;
        } else if (this.color.equals("black")) {
            colorPriceFactor = (float) 1.05;
        } else {
            colorPriceFactor = (float) 1;
        }

        price = producerBasePrice * bodyTypePriceFactor * colorPriceFactor + transmissionBasePrice + engine.calculatePrice();

        return price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "AbstractCar{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", speed='" + speed + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractCar)) return false;
        AbstractCar that = (AbstractCar) o;
        return maxSpeed == that.maxSpeed &&
                Objects.equals(producer, that.producer) &&
                Objects.equals(model, that.model) &&
                Objects.equals(bodyType, that.bodyType) &&
                Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model, speed, maxSpeed, bodyType, color);
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}


