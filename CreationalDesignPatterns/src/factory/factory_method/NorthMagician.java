package factory.factory_method;

public class NorthMagician extends Warrior{

    @Override
    protected void putArmour() {
        System.out.println("North Magician wears armour");

    }

    @Override
    protected void holdPrimaryWeapon() {
        System.out.println("North Magician adds weapon");

    }

    @Override
    protected void march() {
        System.out.println("North Magician marches");

    }
}
