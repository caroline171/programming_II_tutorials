public class GameState{


    private int level;
    private int numOfEnemies;
    private int heroPosition;

    public GameState(int level, int numOfEnemies, int playerPosition) {
        this.level = level;
        this.numOfEnemies = numOfEnemies;
        heroPosition = playerPosition;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getNumOfEnemies() {
        return numOfEnemies;
    }

    public void setNumOfEnemies(int numOfEnemies) {
        this.numOfEnemies = numOfEnemies;
    }

    public int getHeroPosition() {
        return heroPosition;
    }

    public void setHeroPosition(int heroPosition) {
        this.heroPosition = heroPosition;
    }

}
