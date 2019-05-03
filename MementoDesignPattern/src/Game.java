import java.util.ArrayList;
import java.util.Random;

public class Game {

    private GameState state;
    ArrayList<GameState> gameCheckPoints;

    Game(){
        state = new GameState(1, 100, 0);
        gameCheckPoints = new ArrayList<>();
    }

    public void killEnemies(){
        Random random = new Random();
        int killedEnemies = random.nextInt(20);

        state.setNumOfEnemies(state.getNumOfEnemies() - killedEnemies);

        if(state.getNumOfEnemies() < 0){
            updateGameLevel();
        }
    }

    public void moveHero(int steps){
        state.setHeroPosition(state.getHeroPosition() + steps);
    }

    private void updateGameLevel() {
        GameState newState = new GameState(
                state.getLevel() + 1,
                100,
                0
        );

        state = newState;
    }

    public void saveCheckPoint (){
        gameCheckPoints.add(new GameState(
                state.getLevel(),
                state.getNumOfEnemies(),
                state.getHeroPosition()
        ));
    }

    public void restoreCheckPoint(int index){
        GameState restoredState = gameCheckPoints.get(index);
        state = new GameState(restoredState.getLevel(),
                restoredState.getNumOfEnemies(),
                restoredState.getHeroPosition());
    }

    @Override
    public String toString() {
        return "Game State: Level is " + state.getLevel()
                + ", Enemies Count is " + state.getNumOfEnemies()
                + ", Player Position is " + state.getHeroPosition();
    }


}
