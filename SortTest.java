package com.capgemini.prog.day3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortTest {
		@Test
		void testSort() {
			assertArrayEquals(new int [] {1, 5, 6, 7, 12, 14, 19, 23, 26, 35, 37, 47, 52, 78, 86},Sort.sortArray());
		}

	}

}
