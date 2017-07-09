package com.dong;

public class TreeNode {
	int val;
	TreeNode left = null;
	TreeNode right = null;
	TreeNode(int x) {
		val = x;
	}
	
	public static TreeNode getATreeNode() {
		TreeNode a1 = new TreeNode(1);
		TreeNode a2 = new TreeNode(2);
		TreeNode a3 = new TreeNode(3);
		TreeNode a4 = new TreeNode(4);
		TreeNode a5 = new TreeNode(5);
		TreeNode a6 = new TreeNode(6);
		TreeNode a7 = new TreeNode(7);
		
		a1.left = a2;
		a1.right = a3;
		a2.left = a4;
		a2.right = a5;
		a3.left = a6;
		a3.right = a7;
		return a1;
	}
	
	public static void output(TreeNode t) {
		if(t != null) {
			System.out.print(t.val + "");
			output(t.left);
			output(t.right);
		}
	}

}
