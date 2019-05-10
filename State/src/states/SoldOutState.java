package states;

import machine.GumBallMachine;

public class SoldOutState extends GumballMachineState {
    public SoldOutState(GumBallMachine machine) {
        super(machine);
    }

    @Override
    public void insertQuarter() {
        System.out.println("no gumballs");
    }

    @Override
    public void turnCrank() {
        System.out.println("no gumballs");

    }

    @Override
    public void dispenseBall() {
        System.out.println("no gumballs");

    }

    @Override
    public void ejectQuarter() {
        System.out.println("no gumballs");

    }
}
