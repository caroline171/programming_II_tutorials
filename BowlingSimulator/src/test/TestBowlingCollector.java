package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import src.BowlingGame;

public class TestBowlingCollector {

	@Test
	public void testRollOne_scoreShouldBeOne() {
		BowlingGame bowlingGame = new BowlingGame();
		bowlingGame.roll(3);
		assertEquals(3, bowlingGame.calculateScore());
	}
	
	@Test
	public void testRollMany_scoreShouldBeSum() {
		BowlingGame bowlingGame = new BowlingGame();
		bowlingGame.roll(3);
		bowlingGame.roll(3);
		bowlingGame.roll(3);
		bowlingGame.roll(3);
		assertEquals(12, bowlingGame.calculateScore());
	}
	
	@Test
	public void testRollClosedFrame_scoreShouldBeBonus() {
		BowlingGame bowlingGame = new BowlingGame();
		bowlingGame.roll(3);
		bowlingGame.roll(7);
		bowlingGame.roll(3);
		bowlingGame.roll(3);
		assertEquals(19, bowlingGame.calculateScore());
	}
	
	@Test
	public void testRollSpikeFrame_scoreShouldBeDoubleBonus() {
		BowlingGame bowlingGame = new BowlingGame();
		bowlingGame.roll(10);
		bowlingGame.roll(3);
		bowlingGame.roll(3);
		bowlingGame.roll(3);
		assertEquals(25, bowlingGame.calculateScore());
	}
	
	
}
