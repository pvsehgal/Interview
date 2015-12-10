package com.interview;

public class StringCompression {
	
	
	public static void main(String[] args) {
		
		String testStr = "aaabbbcccdddeefffg";
		//testStr = "aa";
		System.out.println(compressString(testStr));
		System.out.println(compressString2(testStr));
		System.out.println(countCompression(testStr));
		
	}
	
	
	public static String compressString(String str){
		String returnStr = "";
		if(str == null){
			return returnStr;
		}
		
		char last = str.charAt(0);
		int charCounter = 1;
		
		for(int i=1; i<str.length(); i++){
			if(last == str.charAt(i)){
				charCounter++;
			} else {
				returnStr += last + "" + charCounter;
				last = str.charAt(i);
				charCounter = 1;
			}
		}
		
		return returnStr + last + charCounter;
	}
	
	public static String compressString2(String str){
		
		String returnStr = "";
		if(str == null){
			return returnStr;
		}
		
		char last = str.charAt(0);
		int charCounter = 1;
		int i =1;
		while(i <str.length()){
			if(last == str.charAt(i)){
				charCounter++;
			} else {
				returnStr += last + "" + charCounter;
				last = str.charAt(i);
				charCounter = 1;
			}
			i++;
		}
		return returnStr + last + charCounter;
	}
	
	
	public static int countCompression(String str){
		if(str == null || str.isEmpty()){
			return 0;
		}
		
		int charCounter = 1;
		int size = 0;
		char last = str.charAt(0);
		
		for(int i=1; i<str.length(); i++){
			if(last == str.charAt(i)){
				charCounter++;
			} else {
				size += 1 + String.valueOf(charCounter).length();
				last = str.charAt(i);
				charCounter = 1;
			}
		} 
		size += 1 + String.valueOf(charCounter).length();
		return size;
	}

}
