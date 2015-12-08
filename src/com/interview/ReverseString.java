package com.interview;

public class ReverseString {

	static int i = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String myString = "Paul";
		System.out.println("Reversed: " + recursivelyReverse(myString));
		myString = "Paul";
		System.out.println("Reversed: " + recursivelyReverse(myString));
		
		
	}
	
	static String recursivelyReverse(String str) {
		
		System.out.println("Input: " + str);
		if(str.length() <= 1 || str == null) {
			System.out.println("Length =1 , Returning: " + str);
			return str;
		}
		
		String returnStr = recursivelyReverse(str.substring(1)) + str.charAt(0);
		System.out.println("Returning: " + returnStr);
		return returnStr;
	}
	
	//static String iterateReverse(String str){
		
	//}

}
