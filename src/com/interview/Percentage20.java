package com.interview;

public class Percentage20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString = "Mr John Smith    ";
		int trueLength = 13;
		
		//char[] myArray = replace(myString, trueLength);
		char[] myArray = replace2(myString, trueLength);
		System.out.println(myArray);
				
	}
	
	public static char[] replace(String str, int trueLength) {
		int length = str.length();
		
		char[] charArray = str.toCharArray();
		char[] returnChar = new char[length];
		
		int counter = 0;
		
		for (int i = 0; i < trueLength; i++) {
			if(charArray[i] == ' '){
				returnChar[counter++] = '%';
				returnChar[counter++] = '2';
				returnChar[counter++] = '0';
				
			} else {
				returnChar[counter++] = charArray[i];
			}
		}
		return returnChar;
	}

	
	public static char[] replace2(String str, int trueLength) {
		int newLength = str.length();
		
		char[] charArray = str.toCharArray();
		
		int counter = 0;
		
		for (int i = trueLength-1; i >= 0; i--) {
			if(charArray[i] == ' '){
				charArray[--newLength] = '0';
				charArray[--newLength] = '2';
				charArray[--newLength] = '%';
			} else {
				charArray[--newLength] = charArray[i];
			}
		}
		return charArray;
	}
	
}
