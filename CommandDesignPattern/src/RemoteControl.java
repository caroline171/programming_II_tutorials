import devices.DefaultCommand;
import devices.RemoteControlCommand;

public class RemoteControl {

    private RemoteControlCommand[] onCommands;
    private RemoteControlCommand[] offCommands;
    private RemoteControlCommand lastCommand;

    RemoteControl(){
        onCommands = new RemoteControlCommand[10];
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = new DefaultCommand();
        }
        offCommands = new RemoteControlCommand[10];
        for (int i = 0; i < offCommands.length; i++) {
            offCommands[i] = new DefaultCommand();
        }
        lastCommand = new DefaultCommand();
    }

    public void addOnCommand(int index, RemoteControlCommand onCommands) {
        this.onCommands[index] = onCommands;
    }

    public void addOffCommand(int index, RemoteControlCommand offCommands) {
        this.offCommands[index] = offCommands;
    }

    public void pushOn(int index){
        onCommands[index].execute();
        lastCommand = onCommands[index];
    }

    public void pushOff(int index){
        offCommands[index].execute();
        lastCommand = offCommands[index];
    }

    public void pushUndo(){
        System.out.println("In Undo:");
        lastCommand.undo();
    }
}
