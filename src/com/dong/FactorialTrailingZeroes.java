package com.dong;

public class FactorialTrailingZeroes {
    public static int trailingZeroes(int n) {
        if(n<=0){
        	return 0;
        }
        int ret = 0;
        while(n>0){
        	ret += n/5;
        	n /= 5;
        }
        return ret;
    }
}
