package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Results;

class ResultTest {

	@Test
	void resulttest() {
		assertEquals("passed",Results.grade(95,80,90));
		assertEquals("promoted",Results.grade(70,80,30));
		assertEquals("promoted",Results.grade(50,80,90));
		assertEquals("promoted",Results.grade(70,20,90));
		assertEquals("failed",Results.grade(20,50,30));
		assertEquals("failed",Results.grade(30,50,40));
		assertEquals("null",Results.grade(4270,8200,3089));
		
	}

}
