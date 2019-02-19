package com.coderbyte.challenges;

import java.util.Scanner;

/**
 * Have the function LetterChanges(str) take the str parameter being passed and modify it using the following algorithm. 
 * Replace every letter in the string with the letter following it in the alphabet (ie. c becomes d, z becomes a). 
 * Then capitalize every vowel in this new string (a, e, i, o, u) and finally return this modified string. 
 * 
 * @author Nitin Bisht
 */
public class LetterChanges {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Output: " + LetterChanges(s.nextLine()));
	}

	private static String LetterChanges(String str) {
		StringBuilder result = new StringBuilder();
		char[] strChar = str.toLowerCase().toCharArray();
		char[] replacements = {'b', 'c', 'd', 'E', 'f', 'g', 'h', 'I', 'j', 'k', 'l', 'm', 'n', 'O', 'p', 'q', 'r', 's', 't', 'U', 'v', 'w', 'x', 'y', 'z', 'A'};
		for(int i=0; i<str.length(); i++) {
			result.append(strChar[i] >= 'a' && strChar[i] <= 'z' ? replacements[strChar[i] - 97] : strChar[i]);
		}
		return result.toString();
	}

}
