package decorator;

public class PowerUpDecorator implements Weapon{

    private Weapon weapon;

    PowerUpDecorator(Weapon weapon){
        this.weapon = weapon;
    }

    @Override
    public String makeNoise() {
        return weapon.makeNoise();
    }

    @Override
    public int fight() {
        return weapon.fight() * 3;
    }
}
