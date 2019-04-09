package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import src.Calculator;

public class TestCalculator {

	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		int result = calculator.add(2, 5);
		assertEquals(7, result);
	}
}
