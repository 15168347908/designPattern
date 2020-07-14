package meditor;

public class TV extends Colleague {

    public TV(Meditor meditor, String name) {
        super(meditor, name);
        meditor.register(name, this);
    }

    void startTV(){
        System.out.println("TV is displaying");
    }

    void endTV(){
        System.out.println("TV is closed");
    }

    @Override
    public void sendMessage(int stateChange) {

    }
}
