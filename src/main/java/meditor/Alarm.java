package meditor;


public class Alarm extends Colleague {
    public Alarm(Meditor meditor, String name) {
        super(meditor, name);
        meditor.register(name, this);
    }

    public void sendAlarm(int stateChange) {
        sendMessage(stateChange);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMeditor().getMessage(stateChange, getName());
    }

}
