package states;

import machine.GumBallMachine;

public class NoCoinState extends GumballMachineState {
    public NoCoinState(GumBallMachine machine) {
        super(machine);
    }

    @Override
    public void insertQuarter() {
        System.out.println("Coin inserted");
        this.gumBallMachine.updateState(gumBallMachine.HAS_COIN);
    }

    @Override
    public void turnCrank() {
        System.out.println("Please insert coin");

    }

    @Override
    public void dispenseBall() {
        System.out.println("Please insert coin");

    }

    @Override
    public void ejectQuarter() {
        System.out.println("please insert coin");
    }
}
