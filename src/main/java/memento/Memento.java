package memento;

import lombok.Data;

/**
 * @author jiangzy
 * @date 2020/7/15 10:10
 */
@Data
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }
}
