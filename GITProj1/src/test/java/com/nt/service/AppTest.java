package com.nt.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class AppTest {
	private static ArithmeticOperation ar;

	@BeforeAll
	public static void setUp() {
		ar = new ArithmeticOperation();
	}

	@Test
	public void testWithPositiveNumbers() {
		//ArithmeticOperation ar = new ArithmeticOperation();
        int actual= ar.sum(100,200);
        int expected=300;
        assertEquals(expected, actual, "You got the Result successfully!");
	}
	@Test
	public void testWithNegativeNumbers() {
		//ArithmeticOperation ar = new ArithmeticOperation();
        int actual= ar.sum(100,-200);
        int expected=-100;
        assertEquals(expected, actual, "You got the Result successfully!");
	}
	@Test
	public void testWithZeroNumbers() {
		//ArithmeticOperation ar = new ArithmeticOperation();
        int actual= ar.sum(0,0);
        int expected=0;
        assertEquals(expected, actual, "You got the Result successfully!");
	}

	@AfterAll
	public static void clearDown() {
		ar = null;
	}
}
