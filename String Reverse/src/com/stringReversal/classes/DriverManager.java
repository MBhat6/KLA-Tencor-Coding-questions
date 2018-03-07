package com.stringReversal.classes;

import java.util.*;

import com.stringReversal.classes.ReverseString;

public class DriverManager {

	public static void main(String[] args) {
		
		System.out.println("\nWelcome to the program. This program enables you to reverse the words in a sentence\n\n");
		
		//create an object of the type ReverseString
		ReverseString myObj = new ReverseString();
		
		//Scanner to take user input
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the string to be reversed: ");
		String str = input.nextLine();
		
		
		//Call the method to get the reversed string
		System.out.println("Reserved words of the string is : " + myObj.reverse(str));
		
	}

}
