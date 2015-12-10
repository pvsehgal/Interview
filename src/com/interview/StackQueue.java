package com.interview;

import java.util.Stack;

public class StackQueue<Item> {

	private Stack<Item> s1;
	private Stack<Item> s2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackQueue<String> sq = new StackQueue<String>();

		
		for(int i=1; i<10; i++){
			sq.enqueue(Integer.toString(i));
		}
		
		String str = "";
		do{
			str = sq.dequeue();
			System.out.println(str);
		} while (str != null);
	}
	
	public StackQueue(){
		s1 = new Stack<Item>();
		s2 = new Stack<Item>();
	}
	
	public void enqueue(Item i){
		s1.push(i);
	}
	
	public Item dequeue() {
		if(s1.isEmpty()){
			return null;
		}
		
		if(s1.size() == 1){
			return s1.pop();
		}
		
		while(s1.size()>1){
			s2.push(s1.pop());
		}
		
		Item i = s1.pop();
		
		while(!s2.isEmpty()){
			s1.push(s2.pop());
		}
		
		return i;
	}

}
