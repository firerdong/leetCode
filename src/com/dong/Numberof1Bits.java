package com.dong;

public class Numberof1Bits {
    public static int hammingWeight(int n) {
        long t = 1l;
        int ret = 0;
        while(t <= 0x80000000l) {
        	if((n&t) != 0) {
        		ret ++;
        	}
        	t = t<<1;
        }
        return ret;
    }
}
