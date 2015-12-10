package com.interview;

public class removeDuplicatesLL {

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
		
		Node printNode = n1;
		
		while (printNode != null){
			System.out.println(printNode.getData());
			printNode = printNode.getNext();
		}
		
		System.out.println("");
		removeDuplicates(n1);
		
		printNode = n1;
		while (printNode != null){
			System.out.println(printNode.getData());
			printNode = printNode.getNext();
		}
	}
	
	public static void removeDuplicates(Node head) {
		Node reference = head;
		Node current = head;
		Node previous = head;
		
		if(reference == null) {
			return;
		}
		
		while(reference != null) {
			current = reference.getNext();
			if(current == null){
				return;
			}
			do {
				if(reference.getData() == current.getData()){
					previous.setNext(current.getNext());
				}
				
				previous = current;
				current = current.getNext();
				
			} while(current != null);
			reference = reference.getNext();
		};	
	}

}
