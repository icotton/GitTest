/**
 * 
 */
package com.clearswift.es;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author ianc
 *
 */
public class FactTest {

	/**
	 * Test method for {@link com.clearswift.es.Fact#factorial(int)}.
	 */
	@Test
	public void testFactorial1() {
		assertEquals("1! value not correct", Fact.factorial(1), 1);
	}
	
	@Test
	public void testFactorial0() {
		assertEquals("0! value not correct", Fact.factorial(0), 1);
	}

	@Test
	public void testFactorialNormal() {
		assertEquals("5! value not correct", Fact.factorial(5), 120);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testFactorialNegative() {
		Fact.factorial(-3);
	}
}
