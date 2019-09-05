package engine;

import java.util.*;

public class Caterpillar extends AbstractEngine {

    public Caterpillar(int power, int cylinderAmount, String controlSystem, String state, float fuelConsumption) {
        super(power, cylinderAmount, controlSystem, state, fuelConsumption);
    }


    @Override
    public void run() {
        System.out.println("Ключ на старт");

    }

    @Override
    public void stop() {
        System.out.println("Перед остановом остудите турбину");
        System.out.println("Ждем...");
        System.out.println("Ждем..");
        System.out.println("Ждем.");
        System.out.println("Двигатель заглушен");
    }

}
