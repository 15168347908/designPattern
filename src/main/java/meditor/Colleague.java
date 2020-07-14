package meditor;

import lombok.Data;

@Data
public abstract class Colleague {
    private Meditor meditor;
    private String name;

    public Colleague(Meditor meditor, String name) {
        this.meditor = meditor;
        this.name = name;
    }

    protected Meditor getMeditor() {
        return this.meditor;
    }

    public abstract void sendMessage(int stateChange);
}
