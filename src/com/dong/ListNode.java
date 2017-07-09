package com.dong;

public class ListNode {
	int val;
	ListNode next = null;
	ListNode(int i) {
		val = i;
	}

	
	public static ListNode getAListNode1() {
		ListNode a1 = new ListNode(1);
		ListNode a2 = new ListNode(1);
		ListNode a3 = new ListNode(1);
		a1.next = a2;
		a2.next = a3;
		a3.next = null;
		return a1;
	}
	
	public static ListNode getAListNode() {
		ListNode a1 = new ListNode(0);
		ListNode a2 = new ListNode(1);
		ListNode a3 = new ListNode(1);
		ListNode a4 = new ListNode(2);
		ListNode a5 = new ListNode(2);
		ListNode a6 = new ListNode(3);
		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		a5.next = a6;
		a6.next = null;
		return a1;
	}
	
	public static void output(ListNode ln) {
		while(ln != null) {
			System.out.print(ln.val + "->");
			ln = ln.next;
		}
		System.out.println();
	}

}
