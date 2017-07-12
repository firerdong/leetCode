package com.dong;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        if(nums == null || nums.length == 0) {
        	return 0;
        }
        int ret = 0;
        for(int i : nums) {
        	ret ^= i;
        }
        return ret;
    }
}
