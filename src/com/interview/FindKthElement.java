package com.interview;

public class FindKthElement {

	static Node n1;
	static Node n2;
	static Node n3;
	static Node n4;
	static Node n5;
	static Node n6;
	static Node n7;
	static Node n8;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		n1 = new Node('a');
		n2 = new Node('b');
		n3 = new Node('c');
		n4 = new Node('d');
		n5 = new Node('e');
		n6 = new Node('c');
		n7 = new Node('b');
		n8 = new Node('f');
		
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		n5.setNext(n6);
		n6.setNext(n7);
		n7.setNext(n8);
		
		System.out.println("2nd to the last element: " + findKthElement(n1, 2).getData());
		
		System.out.println("");
		IntWrapper iWrapper = new IntWrapper();
		
		System.out.println("2nd to the last element: " + recursiveKthElement(n1, 2, iWrapper).getData());

	}
	
	public static Node findKthElement(Node head, int kthElement){
		int length = 0;
		int counter = 0;
		int targetElement = 0;
		Node returnNode = null;
		Node current = head;
		
		if(head == null){
			return returnNode;
		}
		
		do {
			System.out.println(current.getData());
			length ++;
			current = current.getNext();
		} while(current != null);
		
		//System.out.println("Linked List has " + length + " elements.");
		
		current = head;
		targetElement = length - kthElement;
		
		//System.out.println("Target Element: " + targetElement);
		
		while(counter != targetElement) {
			current = current.getNext();
			counter++;
		};
		
		return current;
	}
	
	
	
	public static Node recursiveKthElement(Node head, int k, IntWrapper iWrapper) {
		if(head == null){
			return head;
		}
		
		System.out.println("Node: " + head.getData());
		
		Node aNode = recursiveKthElement(head.getNext(), k, iWrapper);
		iWrapper.value = iWrapper.value + 1;
		
		if(k == iWrapper.value){
			System.out.println("Returning: " + head.getData());
			return head;
		}
		
		return aNode;
	}
	
    static class IntWrapper {
    	public int value = 0;
    }

}
