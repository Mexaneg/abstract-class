import builder.*;
import car.*;

import java.util.*;

public class main {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        Vehicle car = builder.setColor("red").add("radio").add("салон кожжаный").setMarka("bmw").setModel("x5")
                .setEngine("8 цилиндро").setKorobka("auto").build();

        System.out.println(car.calculatePrice());
    }
}
