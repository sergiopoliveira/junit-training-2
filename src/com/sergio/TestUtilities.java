package com.sergio;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class TestUtilities {
	
	Utilities utilities;
	
	@Before
	public void setup() {
		utilities = new Utilities();
	}
	
	@Test
	public void testEveryNthChar() {
		char[] expected = {'e','l'};
		char[] valuePassed = {'h','e','l','l','o'};
		assertArrayEquals(expected,utilities.everyNthChar(valuePassed, 2));
	}

	@Test
	public void testRemovePairs() {
		assertEquals("ABCDEF", utilities.removePairs("AABCDDEFF"));
		assertNull("did not get null returned when argument passed was null",utilities.removePairs(null));
		assertEquals("ABCABDEF", utilities.removePairs("ABCCABDEEF"));
		assertEquals("A",utilities.removePairs("A"));
		assertEquals("",utilities.removePairs(""));
	}

	@Test
	public void testConverter() {
		assertEquals(300, utilities.converter(10, 5));
	}
	
	@Test(expected=ArithmeticException.class)
	public void testConverted_divideByZero() throws Exception{
		utilities.converter(10, 0);
	}
	

	@Test
	public void testNullIfOddLength() {
		assertNull(utilities.nullIfOddLength("hey"));
		assertNotNull(utilities.nullIfOddLength("hi"));
	}

}
