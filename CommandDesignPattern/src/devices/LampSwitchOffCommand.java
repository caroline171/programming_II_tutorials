package devices;

public class LampSwitchOffCommand implements RemoteControlCommand {
    private Lamp lamp;

    public LampSwitchOffCommand(Lamp lamp){
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.switchOff();
    }

    @Override
    public void undo() {
        lamp.switchOn();
    }
}
