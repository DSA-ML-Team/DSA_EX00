package de.unistuttgart.vis.dsass2021.ex00.p1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

/**
 * You should use this class to test your class {@link Calculator}, using JUnit
 * assertions like {@link Assert#assertEquals(Object, Object)}. For additional
 * information on how to test your code with JUnit visit
 * http://www.vogella.com/tutorials/JUnit/article.html
 */
public class CalculatorTest {

	/**
	 * Just create additional tests by creating new methods according to this
	 * pattern.
	 */
	@Test
	public void testAdd() {
		final ICalculator cal = new Calculator();
		assertEquals(2 + 5, cal.add(2, 5));
		assertEquals(3 + 4, cal.add(3, 4));
	}

	// Add your test methods here
	

}
