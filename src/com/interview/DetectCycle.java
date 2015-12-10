package com.interview;

public class DetectCycle {

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
		n8.setNext(n1); // has ccyle
		
		System.out.println("hasCycle: " + hasCycle(n1));
		
	}

	public static boolean hasCycle(Node head) {
		
		Node x1 = head;
		Node x2 = head;
		
		do{
			x1 = x1.getNext();
			if(x1 == null){
				return false;
			}
			x2 = x2.getNext().getNext();
			if(x2 == null){
				return false;
			}
			
		} while(x1 != x2);
		
		return true;
	}
	
}
