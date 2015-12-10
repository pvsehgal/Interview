package com.interview;

public class PalinDrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myStr1 = "mom";
		String myStr2 = "abcde";
		String myStr3 = "abcba";
		System.out.println(isPalinDrome(myStr1));
		System.out.println(isPalinDrome(myStr2));
		System.out.println(isPalinDrome(myStr3));
	}
	
	public static boolean isPalinDrome(String str){
		if(str == null || str.isEmpty()){
			return false;
		}
		StringBuffer strBr = new StringBuffer();
		for(int i=str.length()-1; i>= 0; i--){
			strBr.append(str.charAt(i));
		}
		
		if(str.equals(strBr.toString())){
			return true;
		} else {
			return false;
		}
	}

}
