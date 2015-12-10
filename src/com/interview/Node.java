package com.interview;

public class Node {
	
	private char data;
	private Node next = null;
	private Node previous = null;
	
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
	
	public Node getPrevious() {
		return previous;
	}
	
	public void setPrevious(Node n) {
		previous = n;
	}

}
