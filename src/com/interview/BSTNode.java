package com.sehgal.interview;

public class BSTNode {

	
	private BSTNode leftNode;
	private BSTNode rightNode;
	private int data;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BSTNode headNode = new BSTNode(5);
		
		BSTNode nodel1 = new BSTNode(3);
		BSTNode nodel2 = new BSTNode(1);
		
		BSTNode noder1 = new BSTNode(9);
		BSTNode noder2 = new BSTNode(8);
		BSTNode noder3 = new BSTNode(14);
		BSTNode noder4 = new BSTNode(7);
		
		headNode.setLeftNode(nodel1);
		headNode.setRightNode(noder1);
		
		nodel1.setLeftNode(nodel2);
		
		noder1.setRightNode(noder3);
		noder1.setLeftNode(noder2);
		
		noder2.setLeftNode(noder4);
		
		
		System.out.println("Height: " + getHeight(headNode));
		System.out.println("Count: " + noOfNodes(headNode));
		
	}
	
	public BSTNode(int data){
		leftNode = null;
		rightNode = null;
		this.data = data;
	}
	
	public int getData(){
		return data;
	}
	
	public BSTNode getLeftNode() {
		return leftNode;
	}
	
	public BSTNode getRightNode() {
		return rightNode;
	}
	
	public void setRightNode(BSTNode node){
		rightNode = node;
	}

	public void setLeftNode(BSTNode node) {
		leftNode = node;
	}
	
	public boolean hasLeftNode(){
		if(leftNode == null){
			return false;
		} else {
			return true;
		}
	}
	
	
	public boolean hasrightNode(){
		if(rightNode == null){
			return false;
		} else {
			return true;
		}
	}
	
	public static int getHeight(BSTNode node){
		return getRecursiveHeight(node, 0);
	}
	
	private static int getRecursiveHeight(BSTNode node, int height){
		
		System.out.println("getRecursiveHeight("+ node.getData() + ", " + height +")");
		int leftHeight = height;
		int rightHeight = height;
		if(node.hasLeftNode()){
			leftHeight++;
			leftHeight =  getRecursiveHeight(node.getLeftNode(), leftHeight); 
		} 
		
		if(node.hasrightNode())  {
			rightHeight++;
			rightHeight =  getRecursiveHeight(node.getRightNode(), rightHeight);
		}
		
		
		return (rightHeight > leftHeight) ? rightHeight : leftHeight;
	}
	
	public static int noOfNodes(BSTNode head){
		return getRecursiveNoOfNodes(head, 1);
	}
	
	private static int getRecursiveNoOfNodes(BSTNode node, int count){
		System.out.println("getRecursiveNoOfNodes("+ node.getData() + ", " + count +")");
		if(node.hasLeftNode()){
			count++;
			count = getRecursiveNoOfNodes(node.getLeftNode(), count);
		}
		
		if(node.hasrightNode()){
			count++;
			count = getRecursiveNoOfNodes(node.getRightNode(), count);
		}
		
		return count;
	}
	
	
    
	
}
