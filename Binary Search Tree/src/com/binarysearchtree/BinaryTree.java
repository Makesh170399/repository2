package com.binarysearchtree;

public class BinaryTree {
	Node prev = null;
	public boolean isBST(Node node) {
		if(node ==null) {
			return true;
		}
		if(!isBST(node.left)) 
			return false;
			if (prev != null && node.data < prev.data) {
			      return false;
			    }
			

			    prev = node;
			    
			    return isBST(node.right);
			
		}
	public Node createnewnode(int val) {
		Node newnode=new Node();
		newnode.data=val;
		newnode.left=null;
		newnode.right=null;
		return newnode;
	}
	}

