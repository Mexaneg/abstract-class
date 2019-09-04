package car;

import engine.*;

public interface Vehicle {

    void accelerate();

    void brake();

    int getSpeed();

    void setSpeed(int speed);

    float calculatePrice();

    Engine getEngine();

}
