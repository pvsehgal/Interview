package com.interview;

import java.util.Arrays;

public class UniqueCharacters {

	
	public static void main(String[] args) {
		
		String myString = "abcde";
		//System.out.println("hasUniqueChars" + ": " + hasUniqueChars(myString));
		//System.out.println("hasUniqueChars2" + ": " + hasUniqueChars2(myString));
		//System.out.println("hasUniqueChars3" + ": " + hasUniqueChars3(myString));
		System.out.println("hasUniqueChars4" + ": " + hasUniqueChars4(myString));
	}
	
	//compare every character to every other character
	public static boolean hasUniqueChars(String testString) {
		boolean isUnique = false;
		
		if(testString.length() > 128) {
			return false;
		}
		int charIndex = 0;
		while(charIndex<testString.length()) {
			for (int i = 0; i < testString.length(); i++) {
				if(i !=  charIndex){
					if(testString.charAt(charIndex) == testString.charAt(i)){
						return false; 
					}
				}
			}
			charIndex ++;
		}
		return true;
	}
	
	
	//compare every character to every other character
	public static boolean hasUniqueChars2(String testString) {
		boolean isUnique = false;
		
		if(testString.length() > 128) {
			return false;
		}
		
		char[] charArray = testString.toCharArray();
		
		Arrays.sort(charArray);
		
		int charIndex = 0;
		while(charIndex < charArray.length) {
			for (int i = 0; i < charArray.length; i++) {
				if(i !=  charIndex){
					if(charArray[charIndex] == charArray[i]){
						return false; 
					}
				}
			}
			charIndex ++;
		}
		return true;
	}
	
	//if ascii character set then there is max of 128 characters
	//compare every character to every other character
	public static boolean hasUniqueChars3(String testString) {
				
		if(testString.length() > 128){ 
			return false;
		}
		 // array set to false by default
		boolean[] bArray = new boolean[128];
		
		
		for (int i = 0; i < testString.length(); i++) {
			int val = testString.charAt(i);
			//System.out.println(val);
			if(bArray[val]){
				return false;
			}
			bArray[val] = true;
		}
		return true;
	}
	
		
	public static boolean hasUniqueChars4(String testString) {
		
		int checker = 0;
		 // array set to false by default
		
		for (int i = 0; i < testString.length(); i++) {
			int val = testString.charAt(i) - 'a';
			System.out.println("val: " + val + ": " + Integer.toBinaryString(val));
			
			System.out.println("(1<< val): " + Integer.toBinaryString((1<< val)));
			System.out.println("checker: " + checker + ": " + Integer.toBinaryString(checker));
			System.out.println("checker & (1<< val): " + (checker & (1<< val)));
			if((checker & (1<< val)) > 0){
				return false;
			}
			checker |= (1 << val);
			System.out.println("checker: " + checker + ": " + Integer.toBinaryString(checker));
			System.out.println();
		}
		return true;
	}	
	
}
