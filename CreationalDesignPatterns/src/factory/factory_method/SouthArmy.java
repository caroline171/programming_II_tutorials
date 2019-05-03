package factory.factory_method;

public class SouthArmy extends Army{

    @Override
    protected Warrior createWarriorFromType(String type) {
        Warrior warrior = null;
        if (type == "knight"){
            warrior = new SouthKnight();
        } else if (type == "magician"){
            warrior = new SouthMagician();
        }

        return warrior;
    }
}
