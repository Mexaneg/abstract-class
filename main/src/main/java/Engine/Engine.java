package Engine;

import java.util.*;

public interface Engine {

    void run();

    void stop() throws InterruptedException;

    ArrayList<String> getErrors();

    void cleanErrors();

    float calculatePrice();


}
