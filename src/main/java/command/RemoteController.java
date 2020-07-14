package command;

public class RemoteController {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (Command onCommand : onCommands) {
            onCommand = new NoCommand();
        }
        for (Command offCommand : offCommands) {
            offCommand = new NoCommand();
        }
    }

    public void setCommand(int no,Command onCommand,Command offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    public void onButtonWasPushed(int no){
        onCommands[no].execute();
        undoCommand.undo();
    }

    public void offButtonWasPushed(int no){
        offCommands[no].execute();
        undoCommand.undo();
    }
}
