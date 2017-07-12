package com.dong;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if( s==null || s.equals("") ) {
        	return true;
        }
        int is = 0;
        int ie = s.length()-1;
        while(true) {
        	char start;
        	do{
        		if(is >= s.length()) {
        			return true;
        		}
        		start = s.charAt(is++);
        	}while( (!Character.isAlphabetic(start)) && (!Character.isDigit(start)));
        	
        	char end;
        	do{
        		if(ie >= s.length()) {
        			return true;
        		}
        		end = s.charAt(ie--);
        	}while((!Character.isAlphabetic(end)) && (!Character.isDigit(end)));
        	if( (is-1) >= (ie+1) ) {
        		break;
        	}
        	if(Character.toUpperCase(start) != Character.toUpperCase(end)) {
        		return false;
        	}
        }
        return true;
    }
}
