import devices.*;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        LampSwitchOnCommand lampOn = new LampSwitchOnCommand(lamp);
        LampSwitchOffCommand lampOff = new LampSwitchOffCommand(lamp);

        TV tv = new TV();
        TVTurnOnCommand tvOn = new TVTurnOnCommand(tv);
        TvTurnOffCommand tvOff = new TvTurnOffCommand(tv);

        PartyOnCommand partyOn = new PartyOnCommand();
        partyOn.addCommand(tvOn);
        partyOn.addCommand(lampOn);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.pushUndo();

        remoteControl.addOnCommand(0, lampOn);
        remoteControl.addOffCommand(0, lampOff);
        remoteControl.pushOn(0);
        remoteControl.pushOff(0);

        remoteControl.addOnCommand(1, tvOn);
        remoteControl.addOffCommand(1, tvOff);
        remoteControl.pushOn(1);
        remoteControl.pushOff(1);

        remoteControl.pushUndo();

        remoteControl.addOnCommand(2, partyOn);
        remoteControl.pushOn(2);

        remoteControl.pushOn(3);
    }
}
