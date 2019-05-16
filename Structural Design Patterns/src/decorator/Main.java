package decorator;

public class Main {

    public static void main(String[] args) {
        Hero myHero = new Hero();
        myHero.setWeapon(new Gun());
        myHero.fight();
        myHero.setWeapon(new AmplifiedSoundDecorator(new Gun()));
        myHero.fight();
        myHero.setWeapon(new PowerUpDecorator(new Gun()));
        myHero.fight();
        myHero.setWeapon(
                new SilenceDecorator(
                new PowerUpDecorator(
                new AmplifiedSoundDecorator(
                new Gun()))));
        myHero.fight();


    }
}
