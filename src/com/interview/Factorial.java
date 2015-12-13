package com.interview;

import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		BigInteger bigInt = new BigInteger(String.valueOf(input));
		
		BigInteger result = factorial(bigInt, BigInteger.ONE);
		
		System.out.println(result.toString());
		
	}
	
	
	
	
	public static BigInteger factorial(BigInteger n, BigInteger currentTotal){
		if(n.equals(BigInteger.ZERO)){
			return currentTotal;
		}
		
		return factorial(n.subtract(BigInteger.ONE),n.multiply(currentTotal));
	}
	
	public static int factorial(int input) {
		
		if(input == 0){
			return 1;
		}
		
		if(input < 0){
			return 0;
		}
		
		int returnInt = 1;
		for(int i = 1; i<=input; i++){
			returnInt *= i;
		}
		return returnInt;
	}

}
