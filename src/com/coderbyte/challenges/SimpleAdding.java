package com.coderbyte.challenges;

import java.util.Scanner;

/**
 * Have the function SimpleAdding(num) add up all the numbers from 1 to num. 
 * For example: if the input is 4 then your program should return 10 because 1 + 2 + 3 + 4 = 10. For the test cases, the parameter num will be any number from 1 to 1000. 
 * @author Nitin Bisht
 *
 */
public class SimpleAdding {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Output: " + SimpleAdding(s.nextInt()));

	}

	private static int SimpleAdding(int num) {
		return num == 0 ? 0 : num + SimpleAdding(num - 1);
	}

}
