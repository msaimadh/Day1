package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Interest;

class InterestTest {
	@Test
	void test() {
		assertEquals(500.0,Interest.simpleInterest(1000,2,25));
		assertEquals(4500.0,Interest.simpleInterest(250,90,20));
		assertEquals(1800.0,Interest.simpleInterest(100,60,30));
		assertEquals(5625.0,Interest.compoundInterest(10000,2,25));
		assertEquals(0.0,Interest.compoundInterest(0,0,0));
	}
}
