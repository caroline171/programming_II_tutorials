package devices;

import java.util.ArrayList;
import java.util.HashMap;

public class PartyOnCommand implements RemoteControlCommand{

    ArrayList<RemoteControlCommand> partyCommands;

    public PartyOnCommand(){
        partyCommands = new ArrayList<>();
    }

    public void addCommand(RemoteControlCommand command){
        partyCommands.add(command);
    }

    @Override
    public void execute() {
        for (RemoteControlCommand command: partyCommands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (int i = partyCommands.size()-1; i >= 0 ; i--) {
            partyCommands.get(i).undo();
        }
    }
}
