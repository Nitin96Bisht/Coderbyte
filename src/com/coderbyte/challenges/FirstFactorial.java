package com.coderbyte.challenges;

import java.util.Scanner;

/**
 * Have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it. 
 * For example: if num = 4, then your program should return (4 * 3 * 2 * 1) = 24. 
 * For the test cases, the range will be between 1 and 18 and the input will always be an integer. 
 */
public class FirstFactorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Output: " + FirstFactorial(s.nextInt()));
	}

	private static int FirstFactorial(int num) {
		if (num == 0) return 1;
		return (num == 1 ? 1 : num * FirstFactorial(num - 1));
	}	
}
