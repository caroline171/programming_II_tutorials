package devices;

public class TvTurnOffCommand implements RemoteControlCommand {
    private TV tv;

    public TvTurnOffCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }

    @Override
    public void undo() {
        tv.turnOn();
    }
}
