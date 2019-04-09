package src;

public class BowlingGame {

	private int[] rolls;
	private int arrayIndex;
	private int frameCount;
	
	public BowlingGame() {
		frameCount = 10;
		arrayIndex = 0;
		rolls = new int[21];
	}
			
	public void roll(int pins) {
		rolls[arrayIndex++] = pins;
	}
	
//	  |   |
//	10 7 6 3 
	public int calculateScore() {
		int score = 0;
		int rollsIndex = 0;
		for (int i = 0; i < frameCount; i++) {
			if(rolls[rollsIndex] + rolls[rollsIndex + 1] == 10) {
				// closed frame
				score += 10 + rolls[rollsIndex + 2];
			} else if (rolls[rollsIndex] == 10) {
				score += 10 + rolls[rollsIndex + 1]*2 + rolls[rollsIndex + 2];
			}
			else {
				// open frame
				score += rolls[rollsIndex] + rolls[rollsIndex + 1]; 
			}
			rollsIndex +=2;

		}
		return score;
	}

	/**
	 * 	public int calculateScore() {
		int score = 0;
		for (int i = 0; i < frameCount; i++) {
			if(i%2 == 1) {
				// odd, end of frame
				if(rolls[i-1] + rolls[i] == 10) {
					// closed frame
					score += (rolls[i-1] + rolls[i] + rolls[i+1]);
				} else {
					score += rolls[i-1] + rolls[i];
				}
			} 
			// no need for else.
		}
		return score;
	}

	 */
}
