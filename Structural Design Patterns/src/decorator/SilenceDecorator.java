package decorator;

public class SilenceDecorator implements Weapon{
    private Weapon weapon;

    SilenceDecorator(Weapon weapon){
        this.weapon = weapon;
    }

    @Override
    public String makeNoise() {
        return weapon.makeNoise() + "SHHHHHHHH";
    }

    @Override
    public int fight() {
        return weapon.fight() * 0;
    }
}
