package command;

public class LighterOnCommand implements Command {
    private LighterReceiver lighterReceiver;

    public LighterOnCommand(LighterReceiver lighterReceiver) {
        this.lighterReceiver = lighterReceiver;
    }

    @Override
    public void execute() {
        lighterReceiver.on();
    }

    @Override
    public void undo() {
        lighterReceiver.off();
    }
}
