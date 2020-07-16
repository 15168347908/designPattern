package memento;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jiangzy
 * @date 2020/7/15 10:11
 */
public class Caretaker {
    private Map<String, Memento> mementos;

    public Caretaker() {
        mementos = new HashMap<>();
    }

    public void save(Memento memento) {
        mementos.put(memento.getState(), memento);
    }

    public void remove(String name) {
        mementos.remove(name);
    }

    public Memento get(String name) {
        return mementos.get(name);
    }
}
