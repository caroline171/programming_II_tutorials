package factory.factory_method;

public class SouthKnight extends Warrior {
    @Override
    protected void putArmour() {
        System.out.println("South Knight puts armour");
    }

    @Override
    protected void holdPrimaryWeapon() {
        System.out.println("South Knight adds weapon");

    }

    @Override
    protected void march() {
        System.out.println("South Knight marches");

    }
}
