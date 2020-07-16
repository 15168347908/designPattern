package memento;

import lombok.Data;

/**
 * @author jiangzy
 * @date 2020/7/15 10:16
 */
@Data
public class Originator {

    private String state;

    public Memento saveStateMemento() {
        return new Memento(state);
    }

    public void setStateFromMemento(Memento memento) {
        setState(memento.getState());
    }
}
