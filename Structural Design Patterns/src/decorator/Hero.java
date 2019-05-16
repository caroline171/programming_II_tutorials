package decorator;

public class Hero {

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    private Weapon weapon;

    public void fight(){
        System.out.println(weapon.makeNoise());
        System.out.println(weapon.fight());
        System.out.println("-----------------------------");
    }

}
