package meditor;

import java.util.HashMap;
import java.util.Map;

public interface Meditor {

    void getMessage(int stateChange, String name);

    void register(String name, Colleague colleague);

    void sendMessage();
}
