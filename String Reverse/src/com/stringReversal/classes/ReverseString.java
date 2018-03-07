package com.stringReversal.classes;

import java.util.Arrays;

public class ReverseString {

	/**
	 * The method reverse takes string as an input and returns a reversed words of it
	 * @param str
	 * @return
	 */
	public String reverse(String str) {
		
		if(str.trim().length() == 0)
			return "INVALID - No string input to reverse";
		
		//Split the input string into an array of strings
		String[] tokens = str.trim().split(" ");
		
		int size = tokens.length; //length of the string array
		
		//A for loop which iterates through half the length of the array.
		for(int index = 0; index < (tokens.length/2) ; index++) {
			
			String temp = tokens[index];
			tokens[index] = tokens[size - 1];
			tokens[size - 1] = temp;
			size--;			
		}
		
		String returnStr = Arrays.toString(tokens);
		
		return returnStr.substring(1, returnStr.length()-1).replace(",", "");
	}
	
}
