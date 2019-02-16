package com.coderbyte.challenges;

import java.util.Scanner;

/**
 * Have the function CheckNums(num1,num2) take both parameters being passed and return the string true.
 * If num2 is greater than num1, otherwise return the string false. If the parameter values are equal to each other then return the string -1. 
 * 
 * @author Nitin Bisht
 */
public class CheckNums {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    System.out.print("Output: " + CheckNums(101, 111));
	}

	private static String CheckNums(int num1, int num2) {
		return num1 == num2 ? "-1" : (num1 < num2) ? "true" : "false";
	}

}
