package states;

import machine.GumBallMachine;

public abstract class GumballMachineState {

    public GumBallMachine gumBallMachine;

    GumballMachineState(GumBallMachine machine){
        gumBallMachine = machine;
    }
    public abstract void insertQuarter();
    public abstract void turnCrank();
    public abstract void dispenseBall();
    public abstract void ejectQuarter();

}
