package com.dong;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        if(numRows <= 0) {
        	List<List<Integer>> ret = new ArrayList<List<Integer>>();
        	return ret;
        }
        List<Integer> current = new ArrayList<Integer>();
        List<List<Integer>> ret = generate(numRows - 1);
        current.add(1);
        if(numRows == 1) {
        } else if(numRows == 2) {
        	current.add(1);
        } else if(numRows == 3) {
        	current.add(2);
        	current.add(1);
        } else {
        	List<Integer> last = ret.get(numRows-2);
        	for(int i=1; i<numRows-1; i++) {
        		current.add(last.get(i-1) + last.get(i));
        	}
        	current.add(1);
        }
       	ret.add(current);
       	return ret;
    }
    
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> ret = new ArrayList<Integer>();
    	if(rowIndex<=0) {
            ret.add(1);
    		return ret;
    	}

    	int a[] = new int[rowIndex+1];
    	if(rowIndex >= 1) {
    		a[0] = 1;
    		a[1] = 1;
    	}
    	
    	for(int i=2; i<=rowIndex; i++) {
    		int add = 0;
    		for(int j=i; j>=0; j--) {
    			int tmp = 0;
    			if(j!=0){
    				tmp = a[j-1];
    			}
    			a[j] = add + tmp;
    			add = tmp;
    			
    		}
    	}
    	for(int k=0; k<rowIndex + 1; k++){
    		if(a[k] > 0) {
    			ret.add(a[k]);
    		}
    	}
    	return ret;
    }
}
