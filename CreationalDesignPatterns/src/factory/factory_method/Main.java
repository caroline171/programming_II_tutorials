package factory.factory_method;

public class Main {

    public static void main(String args[]){
        NorthArmy northArmy = new NorthArmy();
        northArmy.createWarrior("knight");
        northArmy.createWarrior("magician");

        SouthArmy armySouth = new SouthArmy();
        armySouth.createWarrior("knight");
        armySouth.createWarrior("magician");
    }
}
