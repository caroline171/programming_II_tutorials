package machine;

import states.*;

enum GumBallStatesTypes{
    NO_COIN,
    HAS_COIN,
    
}

public class GumBallMachine {


    public GumballMachineState NO_COIN;
    public GumballMachineState HAS_COIN;
    public GumballMachineState SOLD;
    public GumballMachineState SOLD_OUT;

    private GumballMachineState currentState;

    public int getNumOfGumballs() {
        return numOfGumballs;
    }

    private int numOfGumballs;

    GumBallMachine(int initialGumballCount){
        NO_COIN = new NoCoinState(this);
        HAS_COIN = new HasCoinState(this);
        SOLD = new SoldState(this);
        SOLD_OUT = new SoldOutState(this);

        currentState = NO_COIN;
        numOfGumballs = initialGumballCount;
    }

    void insertQuarter(){
        currentState.insertQuarter();
    }

    void turnCrank(){
        currentState.turnCrank();
    }

    void ejectQuarter(){
        currentState.ejectQuarter();
    }

    void dispenseGumBall(){
        currentState.dispenseBall();
    }

    public void releaseGumball() {
        numOfGumballs --;
        if(numOfGumballs == 0){
            currentState = SOLD_OUT;
        } else {
            currentState = SOLD;
        }
    }

    public void updateState(GumballMachineState state){
        currentState = state;
    }

}
