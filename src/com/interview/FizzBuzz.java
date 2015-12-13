package com.interview;

import java.io.*;
import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String input = br.readLine();
		//int n = new Integer(input);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i <= n; i++){
			System.out.println(FizzBuzz(i));
		}

	}

	
	
	public static String FizzBuzz(int input){
		
		if((input % 3 == 0) && (input % 5 == 0)){
			return "FizzBuzz";
		}else if(input % 5 == 0){
			return "Buzz";
		}else if(input % 3 == 0) {
			return "Fizz";
		} else {
			return String.valueOf(input);
		}
	}
	
}
