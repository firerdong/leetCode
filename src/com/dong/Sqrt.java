package com.dong;

public class Sqrt {
    public static int mySqrt(int x) {
    	if(x<=1){
    		return x;
    	}
        long left = 1;
        long right = x/2;
        while(left<right){
            long mid = (left+right)/2;
            if(mid*mid<=x && x<(mid+1)*(mid+1)) {
                return (int)mid;
            } else if(mid*mid > x){
                right = mid -1;
            } else {
                left = mid + 1;
            }
        }
        
    	return (int)left;
    }
}
