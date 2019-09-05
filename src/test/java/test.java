import car.*;
import engine.*;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class test {
    @Test
    public void engineCalculateTest() {
        Caterpillar cat = new Caterpillar(200, 6, "MPI", "off", 30);
        float expected = cat.calculatePrice();
        float actual = 3500f;
        assertEquals(expected, actual, 10);
    }

    @Test
    public void carCalculateTest() {
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
        float actual = 36450f;
        assertEquals(expected, actual, 10);
    }
}
