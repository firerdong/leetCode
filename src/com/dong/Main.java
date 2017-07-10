package com.dong;

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
		
		TreeNode tn = TreeNode.getATreeNode();
		System.out.println(TreeNode.isSymmetric2(tn));
		
	}

}
