package factory.factory_method;

public class NorthKnight extends Warrior{
    @Override
    protected void putArmour() {
        System.out.println("North Knight wears armour");
    }

    @Override
    protected void holdPrimaryWeapon() {
        System.out.println("North Knight holds weapon");

    }

    @Override
    protected void march() {
        System.out.println("North Knight marches");


    }
}
