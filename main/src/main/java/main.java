import car.*;

import java.util.*;

public class main {
    public static void main(String[] args) {
        /*CarBuilder builder = new CarBuilder();
        Vehicle car = builder.setColor("red").add("radio").add("салон кожжаный").setMarka("bmw").setModel("x5")
                .setEngine("8 цилиндро").setKorobka("auto").build();

        System.out.println(car.calculatePrice());

         */
        CarBuilder builder = new CarBuilder();
        Car myCar = builder.color("Красный")
                .add("Стерео система Bose")
                .add("Webasto")
                .add("Коврики")
                .producer("BMW")
                .model("X5")
                .transmission("AT")
                .interior("Кожа Nappa")
                .build();
        System.out.println(myCar.toString());


    }
}
