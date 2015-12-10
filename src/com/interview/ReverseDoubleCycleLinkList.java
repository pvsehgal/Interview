package com.interview;

public class ReverseDoubleCycleLinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Node n1 = new Node('a');
		Node n2 = new Node('b');
		Node n3 = new Node('c');
		Node n4 = new Node('d');
		Node n5 = new Node('e');
		Node n6 = new Node('f');
		Node n7 = new Node('g');
		Node n8 = new Node('h');
		
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		n5.setNext(n6);
		n6.setNext(n7);
		n7.setNext(n8);
		n8.setNext(n1);
		
		n1.setPrevious(n8);
		n2.setPrevious(n1);;
		n3.setPrevious(n2);
		n4.setPrevious(n3);
		n5.setPrevious(n4);
		n6.setPrevious(n5);
		n7.setPrevious(n6);
		n8.setPrevious(n7);
		
		Node printNode = n1;
		do {
			System.out.println(printNode.getData());
			printNode = printNode.getNext();
		} while(printNode != n1);
		
		reverseLinkedList(n1);
		
		System.out.println("");
		
		printNode = n8;
		do {
			System.out.println(printNode.getData());
			printNode = printNode.getNext();
		} while(printNode != n8);

	}

	
	public static void reverseLinkedList(Node head){
		Node newNext = head.getPrevious();
		Node newPrevious = head.getNext();
		head.setNext(newNext);
		head.setPrevious(newPrevious);
		
		recursiveReverse(head, newPrevious);
		
	}
		
    public static void recursiveReverse(Node head, Node current){
    	if(head == current){
    		return;
    	}
    	Node newNext = current.getPrevious();
		Node newPrevious = current.getNext();
		current.setNext(newNext);
		current.setPrevious(newPrevious);
    	recursiveReverse(head, newPrevious);
    }
	
}
