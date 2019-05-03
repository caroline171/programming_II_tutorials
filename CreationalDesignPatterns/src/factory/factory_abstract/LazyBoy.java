package factory.factory_abstract;

public class LazyBoy extends Chair{
    @Override
    public int getLegsCount() {
        return 1;
    }

    @Override
    public void displayChairModel() {
        System.out.println("I am a lazy boy");
    }
}
