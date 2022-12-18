package com.binarysearchtree;

public class BinarySearchTree {

	public static void main(String[] args) {
		BinaryTree bt=new BinaryTree();
		Node root=bt.createnewnode(12);
		root.left=bt.createnewnode(11);
		root.right=bt.createnewnode(13);
		root.left.left = bt.createnewnode(6);
	    root.left.left.left = bt.createnewnode(2);
	    root.left.right = bt.createnewnode(8);
	    root.left.right.left = bt.createnewnode(1);
	    System.out.println(bt.isBST(root));

	}

}
