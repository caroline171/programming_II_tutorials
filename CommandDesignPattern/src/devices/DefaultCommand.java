package devices;

public class DefaultCommand implements RemoteControlCommand {
    @Override
    public void execute() {
        System.out.println("I have no devices");
    }

    @Override
    public void undo() {
        System.out.println("I cannot be un done");
    }
}
