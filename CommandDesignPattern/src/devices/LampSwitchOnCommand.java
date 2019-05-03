package devices;

public class LampSwitchOnCommand implements RemoteControlCommand {

    private Lamp lamp;

    public LampSwitchOnCommand(Lamp lamp){
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.switchOn();
    }

    @Override
    public void undo() {
        lamp.switchOff();
    }
}
