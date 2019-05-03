package factory.factory_method;

public abstract class Army {

    Warrior createWarrior(String type){
        Warrior warrior = createWarriorFromType(type);
        warrior.putArmour();
        warrior.holdPrimaryWeapon();
        warrior.march();

        return warrior;
    }

    protected abstract Warrior createWarriorFromType(String type);
}
