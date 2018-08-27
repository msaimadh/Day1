package com.capgemini.prog.day3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.prog.Search;

	class SearchTest {

		@Test
		void testSearch() {
			assertEquals(1,Search.findNumber(19));
		}
}
