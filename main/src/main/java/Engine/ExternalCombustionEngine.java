package Engine;

import java.util.*;

public class ExternalCombustionEngine extends AbstractEngine {

    public ExternalCombustionEngine(int power, String model, String controlSystem, ArrayList<String> errors, String state, float fuelConsumption) {
        super(power, model, controlSystem, errors, state, fuelConsumption);
    }

    @Override
    public String generateError() {
        return null;
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }

    @Override
    public ArrayList<String> getErrors() {
        return null;
    }

    @Override
    public void cleanErrors() {

    }
}
