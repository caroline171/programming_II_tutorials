package states;

import machine.GumBallMachine;

public class SoldState extends GumballMachineState {
    public SoldState(GumBallMachine machine) {
        super(machine);
    }

    @Override
    public void insertQuarter() {
        System.out.println("please enter coin");

    }

    @Override
    public void turnCrank() {
        System.out.println("please enter coin");

    }

    @Override
    public void dispenseBall() {
        System.out.println("please enter coin");
        gumBallMachine.releaseGumball();
        if(gumBallMachine.getNumOfGumballs() > 0){
            gumBallMachine.updateState(gumBallMachine.NO_COIN);
        } else {
            gumBallMachine.updateState(gumBallMachine.SOLD_OUT);
        }
    }

    @Override
    public void ejectQuarter() {
        System.out.println("please enter coin");

    }
}
