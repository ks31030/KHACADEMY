package com.kh.junit.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ArrayPracticeTest {
//	private ArrayPractice ap = new ArrayPractice();
	
	
	@Test
	public void testPractice1() {
		int[] expected = {1,2,3,4,5,6,7,8,9,10};
		int[] actual = {0,1,2,3,4,5,6,7,8,9};
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPractice2() {
		int[] expected = {0,1,2,3,4,5,6,7,8,9};
		int[] actual = {0,1,2,3,4,5,6,7,8,9};
		assertEquals(expected, actual);
	}
	
}
