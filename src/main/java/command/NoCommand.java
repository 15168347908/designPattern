package command;

public class NoCommand implements Command{

    @Override
    public void execute() {
        System.out.println("没有命令");
    }

    @Override
    public void undo() {
        System.out.println("没有命令");
    }
}
