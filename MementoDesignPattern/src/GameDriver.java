public class GameDriver {

    public static void main(String[] args) {
        Game game = new Game();
        Hero hero = new Hero(game);
        System.out.println(game);
        hero.killEnemy();
        hero.move(20);
        hero.killEnemy();
        hero.killEnemy();
        System.out.println(game);
        hero.move(24);
        hero.killEnemy();
        hero.killEnemy();
        hero.killEnemy();
        hero.killEnemy();
        hero.killEnemy();
        System.out.println(game);
        game.saveCheckPoint();
        hero.killEnemy();
        hero.killEnemy();
        hero.killEnemy();
        hero.killEnemy();
        hero.killEnemy();
        hero.killEnemy();
        System.out.println(game);
        game.saveCheckPoint();
        hero.killEnemy();
        System.out.println(game);
        game.restoreCheckPoint(1);
        System.out.println(game);
        game.restoreCheckPoint(0);
        System.out.println(game);

    }
}
