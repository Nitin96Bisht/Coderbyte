package com.coderbyte.challenges;

/**
 * Have the function FirstReverse(str) take the str parameter being passed and return the string in reversed order. 
 * For example: if the input string is "Hello World and Coders" then your program should return the string sredoC dna dlroW olleH. 
 * @author Nitin Bisht
 *
 */
public class FirstReverse {

	public static void main(String[] args) {
		System.out.println("Output: " + FirstReverse("I Love Code"));
	}

	private static String FirstReverse(String str) {
		return new StringBuilder(str).reverse().toString();
	}

}
