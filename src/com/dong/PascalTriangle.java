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
}
