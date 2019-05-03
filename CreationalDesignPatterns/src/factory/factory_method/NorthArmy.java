package factory.factory_method;

public class NorthArmy extends Army {



    protected Warrior createWarriorFromType(String type){
        Warrior warrior = null;
        if (type == "knight"){
            warrior = new NorthKnight();
        } else if (type == "magician"){
            warrior = new NorthMagician();
        }
        return warrior;
    }
}
