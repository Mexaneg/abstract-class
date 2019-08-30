package Engine;

import java.util.*;

public interface Engine {

    void run();

    void stop();

    ArrayList<String> getErrors();

    void cleanErrors();


}
