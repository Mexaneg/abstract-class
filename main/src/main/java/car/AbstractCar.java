package car;

import Engine.*;

import java.util.*;

public abstract class AbstractCar implements Vehicle {
    private String producer;
    private String model;
    private int maxSpeed;
    private String transmission;
    private String bodyType;
    private String color;

    public AbstractCar(String producer, String model, int maxSpeed, String transmission, String bodyType, String color) {
        this.producer = producer;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.color = color;
    }


    public abstract void openHood();

    public abstract void closeHood();

    public abstract void refuel(int volume);

    public float calculatePrice() {
        int producerBasePrice = 0;
        int transmissionBasePrice = 0;
        float bodyTypePriceFactor = 0;
        float colorPriceFactor = 0;
        float price = 0;
        //producer base price variants
        if (this.producer == "BMW") {
            producerBasePrice = 20000;
        }
        if (this.producer == "Mercedes") {
            producerBasePrice = 30000;
        }
        if (this.producer == "Toyota") {
            producerBasePrice = 10000;
        }
        if (this.producer == "Lada") {
            producerBasePrice = 2000;
        } else {
            producerBasePrice = 5000;
        }

        //transmission base price
        if (this.transmission == "AT") {
            transmissionBasePrice = 1000;
        }
        if (this.producer == "AMT") {
            transmissionBasePrice = 2000;
        }
        if (this.producer == "AT") {
            transmissionBasePrice = 3000;
        } else {
            producerBasePrice = 1500;
        }

        //body type price factors
        if (this.model == "sedan") {
            bodyTypePriceFactor = (float) 1.2;
        }
        if (this.producer == "hatchback") {
            bodyTypePriceFactor = (float) 1.1;
        }
        if (this.producer == "coupe") {
            bodyTypePriceFactor = (float) 1.5;
        }
        if (this.producer == "suv") {
            bodyTypePriceFactor = (float) 2.5;
        } else {
            bodyTypePriceFactor = (float) 1;
        }

        //color price factor
        if (this.color == "red") {
            colorPriceFactor = (float) 1.1;
        }
        if (this.color == "black") {
            colorPriceFactor = (float) 1.05;
        } else {
            colorPriceFactor = (float) 1;
        }

        price = producerBasePrice * bodyTypePriceFactor * colorPriceFactor + transmissionBasePrice;

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
        return Objects.hash(producer, model, maxSpeed, bodyType, color);
    }
}
