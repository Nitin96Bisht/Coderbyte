package com.coderbyte.challenges;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Have the function AlphabetSoup(str) take the str string parameter being passed and return the string with the letters in alphabetical order (ie. hello becomes ehllo). 
 * Assume numbers and punctuation symbols will not be included in the string. 
 * 
 * @author Nitin Bisht
 */
public class AlphabetSoup {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    System.out.print("Output: " + AlphabetSoup(s.nextLine()));

	}

	private static String AlphabetSoup(String str) {
		char[] strToChar = str.toCharArray();
		Arrays.sort(strToChar);
		return new String(strToChar);
	}

}
