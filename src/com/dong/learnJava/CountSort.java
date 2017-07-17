package com.dong.learnJava;

public class CountSort {

	public static  int[] countSort(int []num) {
		//求出最大值最小值
		int max = num[0];
		int min = num[0];
		for(int i : num) {
			if(i>max) {
				max = i;
			}
			if(i<min) {
				min = i;
			}
		}
		//统计各数字出现的次数
		int tmp[] = new int[max - min + 1];
		for(int i=0; i<num.length; i++) {
			tmp[num[i] - min] +=1;//如果各个值之间相差很多，会浪费很多空间
		}
		//求出小于等于当前数字的个数
		for(int i=1; i<tmp.length; i++) {
			tmp[i] = tmp[i] + tmp[i-1];
		}
		int ret[] = new int[num.length];
		//使用原始数据从tmp去拿，这样可以避免拿到不存在的
		for(int i=num.length-1; i>=0; i--) {
			ret[--tmp[num[i]-1]] = num[i];
		}
			
		return ret;
	}
	
	
	public static void main(String[] args) {
		int[] ret = {5,1,1,4,2};
		for(int i:countSort(ret)) {
			System.out.print(i + " ");
		}
	}

}
