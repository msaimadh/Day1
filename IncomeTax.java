package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.IncomeTaxes;

class IncomeTax {

	@Test
	void incometaxtest() {
		assertEquals(0,IncomeTaxes.findIncomeTax(400));
		assertEquals(20000,IncomeTaxes.findIncomeTax(200000));
		assertEquals(40000,IncomeTaxes.findIncomeTax(400000));
		assertEquals(1,IncomeTaxes.findIncomeTax(1200000));
		assertEquals(2,IncomeTaxes.findIncomeTax(-1200000));
		
	}

}
