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
		
		ListNode ln = ListNode.getAListNode1();
		ListNode.output(ln);
		ListNode ln1 = RemoveDuplicatesList.deleteDuplicates(ln);
		ListNode.output(ln1);
	}

}
