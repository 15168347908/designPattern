package meditor;

import java.util.HashMap;
import java.util.Map;

public class ConcreteMeditor implements Meditor {
    private Map<String, Colleague> colleagues;
    private Map<String, String> inters;

    public ConcreteMeditor() {
        colleagues = new HashMap<>();
        inters = new HashMap<>();
    }

    @Override
    public void getMessage(int stateChange, String name) {
        if (colleagues.get(name) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine) colleagues.get(inters.get("CoffeeMachine"))).startCoffee();
            } else if (stateChange == 1) {
                ((TV) colleagues.get(inters.get("TV"))).startTV();
            }
        } else if (colleagues.get(name) instanceof CoffeeMachine) {
            ((Curtains) colleagues.get(inters.get("Curtains"))).upCurtains();
        } else if (colleagues.get(name) instanceof TV) {

        } else if (colleagues.get(name) instanceof Curtains) {

        }
    }

    @Override
    public void register(String name, Colleague colleague) {
        colleagues.put(name, colleague);
        if (colleague instanceof Alarm) {
            inters.put("Alarm", name);
        } else if (colleague instanceof CoffeeMachine) {
            inters.put("CoffeeMachine", name);
        } else if (colleague instanceof TV) {
            inters.put("TV", name);
        } else if (colleague instanceof Curtains) {
            inters.put("Curtains", name);
        }
    }

    @Override
    public void sendMessage() {

    }
}
