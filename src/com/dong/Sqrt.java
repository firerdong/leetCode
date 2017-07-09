package com.dong;

public class Sqrt {
    public static int mySqrt(int x) {
    	if(x<=1){
    		return x;
    	}
    	long i=0;// should be set long
    	for(i=1; i<=x/2; i++){
    		if(i*i<=x && x<(i+1)*(i+1)) {
    			return (int)i;
    		}
    	}
    	return (int)i;
    }
}
