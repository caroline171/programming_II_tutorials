package adapter_ex1;

public class TurkeyDuckAdapter implements Duck{

    private Turkey turkey;

    TurkeyDuckAdapter(Turkey turkey){
        this.turkey = turkey;
    }
    @Override
    public void fly() {
        turkey.hop();
    }

    @Override
    public void quack() {
        turkey.goggle();
    }
}
