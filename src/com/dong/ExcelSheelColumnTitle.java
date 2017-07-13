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

    //171. Excel Sheet Column Number
    static public int titleToNumber(String s) {
    	int base = 1;
    	int ret = 0;
        for(int i=s.length()-1; i>=0; i--) {
        	ret += (s.charAt(i) - 'A' + 1) * base;
        	base *= 26;
        }
        return ret;
    }

}
