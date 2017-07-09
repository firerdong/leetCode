package com.dong;

public class RemoveDuplicatesList {
    public static ListNode deleteDuplicates(ListNode head) {
    	if(head == null) {
    		return null;
    	}
        ListNode i = head;
        while(i != null && i.next != null) {
        		if(i.val == i.next.val) {
        			i.next = i.next.next;
        		}else{
        			i = i.next;
        		}
        }
        return head;
    }	

}
