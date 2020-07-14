package command;

public class LighterOffCommand implements Command {
    private LighterReceiver lighterReceiver;

    public LighterOffCommand(LighterReceiver lighterReceiver){
        this.lighterReceiver = lighterReceiver;
    }

    @Override
    public void execute() {
        lighterReceiver.off();
    }

    @Override
    public void undo() {
        lighterReceiver.on();
    }
}
