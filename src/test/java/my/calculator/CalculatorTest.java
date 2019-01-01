package my.calculator;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator c;

	@Test
	public void addingTwoPositiveNumbers() {
		int sum = c.add(2, 3);
		assertEquals(5, sum);
	}

	@Test
	public void addingNegativeNumbers() {
		int sum = c.add(-3, -4);
		assertEquals(-7, sum);
	}

	@Before
	public void setUp() {
		c = new Calculator();

	}
}
