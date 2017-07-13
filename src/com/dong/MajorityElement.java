package com.dong;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
    	int key = nums[0];
    	int times = 1;
    	for(int i =1; i<nums.length; i++) {
    		if(nums[i] == key) {
    			times ++;
    		} else {
    			times --;
    			if(times == 0) {
    				key = nums[i];
    				times ++;
    			}
    		}
    	}
    	return key;
    }
}
