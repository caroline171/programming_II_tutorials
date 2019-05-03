package devices;

public class TVTurnOnCommand implements RemoteControlCommand{
    private TV tv;

    public TVTurnOnCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
        tv.changeVolume(20);
    }

    @Override
    public void undo() {
        tv.changeVolume(0);
        tv.turnOff();
    }


}
