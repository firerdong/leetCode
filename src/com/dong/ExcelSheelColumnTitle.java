package com.dong;

public class ExcelSheelColumnTitle {
    public static String convertToTitle(int n) {
    	StringBuffer sb = new StringBuffer();
    	while(n > 0) {
    		int m = n%26;
    		if(m == 0) {
    			m = 26;
    		}
    		sb.insert(0, (char)(m-1 + 'A'));
    		n = (n-m)/26;
    	}
    	return sb.toString();
    }
}
