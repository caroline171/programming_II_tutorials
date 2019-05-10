package machine;

public class Main {
    public static void main(String[] args) {
        GumBallMachine gumBallMachine = new GumBallMachine(100);

        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();

        gumBallMachine.ejectQuarter();

    }
}
