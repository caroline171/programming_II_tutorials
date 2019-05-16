package decorator;

public class AmplifiedSoundDecorator implements Weapon{

    private Weapon weapon;

    AmplifiedSoundDecorator(Weapon weapon){
        this.weapon = weapon;
    }

    @Override
    public String makeNoise() {
        return weapon.makeNoise() + "I have a loud Sound";
    }

    @Override
    public int fight() {
      return weapon.fight();
    }
}
