package com.interview;

import java.util.Stack;

public class StackWithMin extends Stack<Integer> {

	private Stack<Integer> minStack;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackWithMin myStack = new StackWithMin();
		myStack.push(7);
		System.out.println("Added: " + myStack.peek());
		System.out.println("Min: " + myStack.min());
		System.out.println("");
		myStack.push(6);
		System.out.println("Added: " + myStack.peek());
		System.out.println("Min: " + myStack.min());
		System.out.println("");
		myStack.push(5);
		System.out.println("Added: " + myStack.peek());
		System.out.println("Min: " + myStack.min());
		System.out.println("");
		myStack.push(6);
		System.out.println("Added: " + myStack.peek());
		System.out.println("Min: " + myStack.min());
		System.out.println("");
		myStack.push(7);
		System.out.println("Added: " + myStack.peek());
		System.out.println("Min: " + myStack.min());
		System.out.println("");
		myStack.push(4);
		System.out.println("Added: " + myStack.peek());
		System.out.println("Min: " + myStack.min());
		System.out.println("");
		myStack.push(5);
		System.out.println("Added: " + myStack.peek());
		System.out.println("Min: " + myStack.min());
		System.out.println("");
		myStack.push(3);
		System.out.println("Added: " + myStack.peek());
		System.out.println("Min: " + myStack.min());
		System.out.println("");
		myStack.pop();
		System.out.println("Popped Next Value: " + myStack.peek());
		System.out.println("Min: " + myStack.min());
		System.out.println("");
		myStack.pop();
		System.out.println("Popped Next Value: " + myStack.peek());
		System.out.println("Min: " + myStack.min());
		System.out.println("");
		myStack.pop();
		System.out.println("Popped Next Value: " + myStack.peek());
		System.out.println("Min: " + myStack.min());
		System.out.println("");
		myStack.pop();
		System.out.println("Popped Next Value: " + myStack.peek());
		System.out.println("Min: " + myStack.min());
		System.out.println("");
		
	}
	
	public StackWithMin(){
		minStack = new Stack<Integer>();
	}
	
	public void push(int value){
		int minValue = min();
		if(value < minValue){
			minStack.push(value);
		} else {
			minStack.push(minValue);
		}
		super.push(value);
	}
	
	public Integer pop() {
		int value = super.pop();
		int minValue = minStack.pop();
		return Integer.valueOf(value);
	}
	
	public int min(){
		if(minStack.isEmpty()){
			return Integer.MAX_VALUE;
		} else {
			return minStack.peek();
		}
	}

}
