package com.coderbyte.challenges;

import java.util.Scanner;

/**
 * Have the function LongestWord(sen) take the sen parameter being passed and return the largest word in the string. 
 * If there are two or more words that are the same length, return the first word from the string with that length. 
 * Ignore punctuation and assume sen will not be empty. 
 * 
 * @author Nitin Bisht
 */
public class LongestWord {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Output: " + LongestWord(s.nextLine()));
	}

	private static String LongestWord(String sen) {
		String[] words = sen.toLowerCase().split("[^A-Za-z0-9]");
		int maxIndex = 0;
		for(int i=1; i<words.length; i++) {
			if(words[i].length() > words[maxIndex].length())
				maxIndex = i;
		}
		return words[maxIndex];
	}

}
