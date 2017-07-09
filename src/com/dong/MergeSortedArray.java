package com.dong;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m<0 || n<0 || nums1==null || nums2==null){
            return;
        }
        int j = m-1;
        int k = n-1;
        for(int i=m+n-1; i>=0; i--) {
            if(k>=0 && j>=0){
                if(nums1[j] >= nums2[k]) {
                    nums1[i] = nums1[j];
                    j--;
                }else{
                    nums1[i] = nums2[k];
                    k--;
                }
            }else if(j>=0){
                nums1[i] = nums1[j];
                j--;
            }else if(k>=0){
                nums1[i] = nums2[k];
                k--;                
            }
        }
    }
}
