package de.unistuttgart.vis.dsass2021.ex01.p2;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * You should use this class to test your class {@link SpeedListTest}, using JUnit
 * assertions like {@link Assert#assertEquals(Object, Object)}. For additional
 * information on how to test your code with JUnit visit
 * http://www.vogella.com/tutorials/JUnit/article.html
 */

public class SpeedListTest {

	/**
	 * Just create additional tests by creating new methods according to this
	 * pattern.
	 */
	
	@Test
	public void testAppend() {
		SpeedList speedList = new SpeedList(); //Initialize object of class
		speedList.append(1); // call method of this object what you want to test
		assertEquals("Ausgabebeschreibung", "expected", "actual"); // compare the expected with the actual value
	}

	// Add your test methods here	

}
