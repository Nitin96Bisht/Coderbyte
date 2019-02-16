package com.coderbyte.challenges;

import java.util.Scanner;

/**
 * Have the function TimeConvert(num) take the num parameter being passed and return the number of hours and minutes the parameter converts to (ie. if num = 63 then the output should be 1:3). 
 * Separate the number of hours and minutes with a colon. 
 * 
 * @author Nitin Bisht
 */
public class TimeConvert {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    System.out.print("Output: " + TimeConvert(s.nextInt()));
	}

	private static String TimeConvert(int num) {
		return num/60 + ":" + num%60;
	}

}
