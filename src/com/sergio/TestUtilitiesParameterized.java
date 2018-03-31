package com.sergio;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestUtilitiesParameterized {

	private Utilities util;
	private String input;
	private String output;
	
	public TestUtilitiesParameterized(String input, String output) {
		this.input = input;
		this.output = output;
	}
	
	@Before
	public void setup() {
		util = new Utilities();
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> testConditions(){
		return Arrays.asList(new Object[][]{
			{"ABCDEFF","ABCDEF"},
			{"AB88EFFG","AB8EFG"},
			{"112233445566","123456"},
			{"ZYZQQB","ZYZQB"},
			{"A","A"}
			});
	}
	
	@Test
	public void testRemovePairs_parameterized() {
	
		 assertEquals(output,util.removePairs(input));
	}
}
