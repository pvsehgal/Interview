package com.interview;

public class StringBufferCompress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myStr = "aabbccddeeff";
		System.out.println(compress(myStr));

	}
	
	
	public static String compress(String str){
		if(str == null) {
			return null;
		}
		
		int size = countCompression(str);
		System.out.println(size);
		if(size > str.length()){
			return str;
		}
		
		StringBuffer strBr = new StringBuffer();
		int charCounter = 1;
		char last = str.charAt(0); // reference to last char
		
		for(int i=1; i< str.length(); i++){
			if(last == str.charAt(i)){
				charCounter++;
			} else {
				strBr.append(last);
				strBr.append(charCounter);
				//System.out.println(strBr);
				last = str.charAt(i);
				charCounter = 1;
			}
		}
		strBr.append(last);
		strBr.append(charCounter);
		return strBr.toString();
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
