package factory.factory_method;

public class SouthMagician extends Warrior {
    @Override
    protected void putArmour() {
        System.out.println("South Magician puts armour");
    }

    @Override
    protected void holdPrimaryWeapon() {
        System.out.println("South Magician adds weapon");

    }

    @Override
    protected void march() {
        System.out.println("South Magician marches");

    }
}
