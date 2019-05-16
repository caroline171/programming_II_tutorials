package adapter_ex1;

public class MallardDuck implements Duck{
    @Override
    public void fly() {
        System.out.println("I am a mallard and i can fly");
    }

    @Override
    public void quack() {
        System.out.println("I am a mallard and i quack");

    }
}
