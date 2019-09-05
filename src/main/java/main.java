import car.*;
import engine.*;

import java.util.*;

public class main {
    public static void main(String[] args) {
        /*CarBuilder builder = new CarBuilder();
        Vehicle car = builder.setColor("red").add("radio").add("салон кожжаный").setMarka("bmw").setModel("x5")
                .setEngine("8 цилиндро").setKorobka("auto").build();

        System.out.println(car.calculatePrice());

         */
        Caterpillar cat = new Caterpillar(200, 6, "MPI", "off", 30);
        CarBuilder builder = new CarBuilder();
        Car car = builder.color("black")
                .add("Стерео система Bose")
                .add("Webasto")
                .add("Коврики")
                .producer("Toyota")
                .model("Prado")
                .transmission("AT")
                .interior("leather")
                .build();
        car.setEngine(cat);
        car.setNumberSeats(7);
        car.setBodyType("suv");
        float expected = car.calculatePrice();
        System.out.println(expected);
    }
}
