package com.dong;

import java.util.ArrayList;
import java.util.List;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		for(int i: new int[]{2,3,4,5,6,8,9,10,15,16,17}) {
//			//70 Climbing Stairs   
//			System.out.println(ClimbingStairs.climbStairs(i));
//			//69 Sqrt(x)   
//			System.out.println(Sqrt.mySqrt(i));
//		}
		
		//83
//		ListNode ln = ListNode.getAListNode1();
//		ListNode.output(ln);
//		ListNode ln1 = RemoveDuplicatesList.deleteDuplicates(ln);
//		ListNode.output(ln1);
		
		//88
//		int a[] = {1,3,5,0,0,0};
//		int b[] = {2,4,6};
//		MergeSortedArray.merge(a, 3, b, 3);
//		for(int i=0;i<a.length; i++){
//			System.out.print(a[i] + " ");
//		}
		
		//100 same tree
//		TreeNode tn = TreeNode.getATreeNode();
//		System.out.println(SameTree.isSameTree(tn, tn));
//		TreeNode tn2 = TreeNode.getATreeNode();
//		tn2.left.left.val = 100;
//		System.out.println(SameTree.isSameTree(tn, tn2));
		
//		TreeNode tn = TreeNode.getATreeNode();
//		System.out.println(TreeNode.isSymmetric2(tn));
		
//		TreeNode tn = TreeNode.getATreeNode();
//		System.out.println(TreeNode.maxDepth(tn));
		
//		TreeNode tn = TreeNode.getATreeNode();
//		TreeNode.output(tn);
//		List<List<Integer>> ll = TreeNode.levelOrderBottom(tn);
//		for(List<Integer> l : ll) {
//			for(int i : l) {
//				System.out.println(i + " ");
//			}
//			System.out.println();
//		}
		
		
//		int[] a = {1,2,3,4,5,6};
//		TreeNode t = TreeNode.sortedArrayToBST(a);
//		TreeNode.output(t);
		
//		TreeNode t1 = new TreeNode(1);
//		TreeNode t2 = new TreeNode(2);
//		TreeNode t3 = new TreeNode(3);
//		t1.left = t2;
//		t2.left = t3;
//		
//		TreeNode p = t1;
//		
//		TreeNode t4 = new TreeNode(4);
//		p.right = t4;
//		
//		System.out.println(t1.right.val);
		
//		TreeNode tn = TreeNode.getATreeNode();
////		System.out.println(TreeNode.isBalanced2(tn));
//		
//		System.out.println(TreeNode.hasPathSum(tn, 8));
		
		List<List<Integer>> ret = PascalTriangle.generate(5);
		for(List<Integer> l : ret) {
			System.out.print("[");
			for(int i : l ) {
				System.out.print(i + " ");
			}
			System.out.println("]");
		}
	}

}
