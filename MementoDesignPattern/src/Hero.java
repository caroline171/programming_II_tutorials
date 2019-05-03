public class Hero {

    private Game game;

    Hero(Game game){
        this.game = game;
    }

    public void move(int steps){
        System.out.println("Moving Hero!");
        game.moveHero(steps);
    }

    public void killEnemy(){
        System.out.println("Killing Enemies!");
        game.killEnemies();
    }
}
