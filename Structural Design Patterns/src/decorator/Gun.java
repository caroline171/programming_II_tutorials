package decorator;

public class Gun implements Weapon{
    @Override
    public String makeNoise() {
        return "pew pew pew";
    }

    @Override
    public int fight() {
        return 3;
    }
}
