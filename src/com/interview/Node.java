package com.sehgal.interview;

public class Node {
	
	private char data;
	private Node next = null;
	
	public Node(char data){
		this.data = data;
	}
	
	public char getData(){
		return data;
	}
	
	public void setNext(Node n){
		next = n;
	}
	
	public Node getNext() {
		return next;
	}

}
