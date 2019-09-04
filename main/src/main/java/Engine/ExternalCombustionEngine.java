package Engine;

import java.util.*;

public class ExternalCombustionEngine extends AbstractEngine {

    public ExternalCombustionEngine(int power, int cylinderAmount, String controlSystem, ArrayList<String> errors, String state, float fuelConsumption) {
        super(power, cylinderAmount, controlSystem, errors, state, fuelConsumption);
    }


    @Override
    public void run() {
        System.out.println("Расзжигаем топку");
        System.out.println("Ждем нагрева воды...");
        System.out.println("Ждем нагрева воды..");
        System.out.println("Ждем нагрева воды.");
        System.out.println("Вода нагрета, давление пара достаточное");
        System.out.println("Двигатель готов к запуску");
    }

    @Override
    public void stop() {
        System.out.println("Гасим топку");
        System.out.println("Ждем остывания воды...");
        System.out.println("Ждем остывания воды..");
        System.out.println("Ждем остывания воды.");
        System.out.println("Котел остыл, двигатель заглушен");
    }

}
