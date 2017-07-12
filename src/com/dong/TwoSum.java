package com.dong;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	/**
	 * 1. Two Sum
	 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
	 * @param numbers
	 * @param target
	 * @return
	 */
    public static int[] twoSum(int[] numbers, int target) {
        int[] ret = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i<numbers.length; i++) {
        	int other = target - numbers[i];
        	if(map.containsKey(other)) {
        		ret[1] = i;
        		ret[0] = map.get(other);
        		return ret;
        	}else{
        		map.put(numbers[i], i);
        	}
        }
        return ret;
    }
    
	/**
	 * 167. Two Sum II - Input array is sorted
	 * Given an array of integers that is already sorted in ascending order, 
	 * find two numbers such that they add up to a specific target number.  
	 * The function twoSum should return indices of the two numbers such that they add up to the target, 
	 * where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
	 * 返回的数组下标从1开始
	 * You may assume that each input would have exactly one solution and you may not use the same element twice.
	 * 
	 */
    public static int[] twoSum2(int[] numbers, int target) {
        int[] ret = new int[2];
        int start = 0;
        int end = numbers.length - 1;
        while(true) {
        	int tmps = numbers[start];
        	int tmpe = numbers[end];
        	if(tmps + tmpe == target) {
        		ret[0] = Math.min(start, end) + 1;
        		ret[1] = Math.max(start, end) + 1;
        		return ret;
        	}else if(tmps + tmpe > target) {
        		end--;
        	}else{
        		start++;
        	}
        	if(start == end) {
        		break;
        	}
        }
        
        return null;
    }
}
