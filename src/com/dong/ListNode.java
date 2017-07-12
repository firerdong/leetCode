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
		a6.next = a2;
		return a1;
	}
	
	public static void output(ListNode ln) {
		while(ln != null) {
			System.out.print(ln.val + "->");
			ln = ln.next;
		}
		System.out.println();
	}
	
    public static boolean hasCycle(ListNode head) {
        if(head == null) {
        	return false;
        }
        ListNode l1 = head;
        ListNode l2 = head;
        while(l1!=null && l2 != null) {
        	l1 = l1.next;
        	if(l1 == null) {
        		return false;
        	}
        	l2 = l2.next;
        	if(l2 != null) {
        		l2 = l2.next;
        	}else{
        		return false;
        	}
        	if(l1 == l2) {
        		return true;
        	}
        }
        return false;
    }
    
    //160. Intersection of Two Linked Lists
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) {
        	return null;
        }
        int lenA = 0;
        ListNode pA = headA;
        while(pA != null) {
        	lenA++;
        	pA = pA.next;
        }
        
        int lenB = 0;
        ListNode pB = headB;
        while(pB != null) {
        	lenB ++;
        	pB = pB.next;
        }
        
        if(lenA==0 || lenB==0) {
        	return null;
        }
        
        if(lenA > lenB) {
        	pA = headA;
        	int pre = lenA - lenB;
        	while(pre > 0) {
        		pA = pA.next;
        		pre --;
        	}
        	pB = headB;
        }else{
        	pB = headB;
        	int pre = lenB - lenA;
        	while(pre > 0) {
        		pB = pB.next;
        		pre --;
        	}
        	pA = headA;
        }
        
        while(pA!=null && pB !=null) {
        	if(pA == pB) {
        		return pA;
        	}
        	pA = pA.next;
        	pB = pB.next;
        }
        
        return null;
    }

}
