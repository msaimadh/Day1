package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Squareroot;

class squarerootTest {

	@Test
	void testfindSquarerootTest() {
		assertEquals(25,Squareroot.findSquarerootTest(5));
		assertEquals(36,Squareroot.findSquarerootTest(6));
	}

}
