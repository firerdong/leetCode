package com.dong;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        if(n<=1)
            return 1;
        if(n == 2) {
            return 2;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }
    
    public static int climbStairs2(int n) {
        if(n <= 1)
            return 1;
        if(n == 2) {
            return 2;
        }
        int[] ret = {1,2,3};
        for(int i=3; i<=n; i++){
        	ret[2] = ret[0] + ret[1];
        	ret[0] = ret[1];
        	ret[1] = ret[2];
        }
        
        return ret[2];
    }
}
