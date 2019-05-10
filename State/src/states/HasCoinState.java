package states;

import machine.GumBallMachine;

public class HasCoinState extends GumballMachineState {
    public HasCoinState(GumBallMachine machine) {
        super(machine);
    }

    @Override
    public void insertQuarter() {
        System.out.println("cannot add another coin, turn crank instead");

    }

    @Override
    public void turnCrank() {
        System.out.println("dispense ball");
        gumBallMachine.releaseGumball();
        if(gumBallMachine.getNumOfGumballs() > 0){
            gumBallMachine.updateState(gumBallMachine.SOLD);
        } else {
            gumBallMachine.updateState(gumBallMachine.SOLD_OUT);
        }
    }

    @Override
    public void dispenseBall() {
        System.out.println("please dispense");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("ejected quarter take ur money");

    }
}
