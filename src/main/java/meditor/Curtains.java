package meditor;

public class Curtains extends Colleague {

    public Curtains(Meditor meditor, String name) {
        super(meditor, name);
        meditor.register(name, this);
    }

    void upCurtains(){
        System.out.println("I am holding up Curtains");
    }

    @Override
    public void sendMessage(int stateChange) {

    }
}
