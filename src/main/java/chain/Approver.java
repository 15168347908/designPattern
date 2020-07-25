package chain;

import lombok.Data;

@Data
public abstract class Approver {
    private Approver approver;
    private String name;

    public abstract void handleRequest(Request request);

}
