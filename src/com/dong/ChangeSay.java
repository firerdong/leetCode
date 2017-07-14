package com.dong;

public class ChangeSay {

	
	static String change(int i) {
		if(i==0){
			return nums[0];
		}
		int base10 = 10;
		int cntBase = 0;
		
		StringBuffer sb = new StringBuffer();
		while(i > 0) {
			int tmp = i%base10;
			if(cntBase % 4 == 0 ) {
				sb.insert(0, bases2[cntBase/4]);
			}
			if(tmp != 0) {
				sb.insert(0, bases[cntBase%4]);
			}
			if(tmp==0 && sb.length()!=0 && sb.charAt(0)=="零".toCharArray()[0] ) {
				
			}else{
				sb.insert(0, nums[tmp]);
			}
			cntBase++;
			i /=10;
		}
		
		String ret = sb.toString();
		while(ret.contains("零零")) {
			ret = ret.replace("零零", "零");
		}
		if(ret.endsWith("零")){
			ret = ret.substring(0, ret.length()-1);
		}
		if(ret.startsWith("一十")) {
			ret = ret.replace("一十", "十");
		}
		
		
		return ret;
	}
	
	static String nums[] = {"零","一","二","三","四","五","六","七","八","九"};
	static String bases[] = {"", "十","百","千"};
	static String bases2[] = {"", "万","亿"};
	
	static String change2(int i) {
		if(i==0){
			return nums[0];
		}
		int base2 = 10000;
		int cntBase2 = 0;
		StringBuffer sb = new StringBuffer();
		while(i>0){
			int tmp = i%base2;
			String subStr = sub(tmp);
			if (!subStr.equals("")) {
				sb.insert(0, bases2[cntBase2]);
				sb.insert(0, subStr);
			}
			cntBase2++;
			i= i/base2;
		}
		String ret = sb.toString();
		if(ret.startsWith("零")) {
			ret = ret.substring(1,ret.length());
		}
		ret = ret.replace("一十", "十");
		
		return ret;
	}
	static String sub(int i) {
		int base10 = 10;
		int cntBase = 0;
		StringBuffer sb = new StringBuffer();
		for(int k = 0; k<4; k++) {
			int tmp = i%base10;
			if(tmp != 0) {
				sb.insert(0, bases[cntBase]);
			}
			cntBase++;
			sb.insert(0, nums[tmp]);
			i /= base10;
		}
		
		String ret = sb.toString();
		while(ret.contains("零零")) {
			ret = ret.replace("零零", "零");
		}
		if(ret.endsWith("零")){
			ret = ret.substring(0, ret.length()-1);
		}
		return ret;
	}
	
	public static void main(String[] args) {
		System.out.println(change2(1034050021));
		System.out.println(change2(1234052100));
		System.out.println(change2(0));
		System.out.println(change2(1));
		System.out.println(change2(10));
		System.out.println(change2(1000000100));
	}

}
