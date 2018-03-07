package com.stringReversal.junits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.stringReversal.classes.ReverseString;

class StringReversalTest {

	@Test
	void test() {
		
		ReverseString obj = new ReverseString();
		
		String input_1 = "KLA-Tencor is a great company to work with";
		String input_2 = "";
		String input_3 = "0";
		
		//Test case 1
		assertEquals(obj.reverse(input_1), "with work to company great a is KLA-Tencor");
		
		//Test case 2
		assertEquals(obj.reverse(input_2), "INVALID - No string input to reverse");
		
		//Test case 3
		assertEquals(obj.reverse(input_3), "0");
		
		//fail("INVALID - No string input to reverse");
	}

}
