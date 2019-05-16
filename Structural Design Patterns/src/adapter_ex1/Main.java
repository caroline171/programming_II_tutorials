package adapter_ex1;

public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey myTurkey = new Turkey();
        simulateBird(duck);
        simulateBird(new TurkeyDuckAdapter(myTurkey));
    }

    private static void simulateBird(Duck duck) {
        duck.fly();
        duck.quack();
        System.out.println("----------------------------------"
        );
    }
}
