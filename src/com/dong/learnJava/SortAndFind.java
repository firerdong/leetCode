package com.dong.learnJava;

public class SortAndFind {

	public static void bubbleSort(int a[]) {
		if(a == null) {
			return;
		}
		
		for(int i=0; i<=a.length-2; i++) {
			for(int j=0; j<=a.length-2-i; j++) {
				if(a[j] > a[j+1]) {
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
	}
	
	public static void quickSort(int a[], int start, int end) {
		if (start >= end) {
			return;
		}
		int i= start;
		int j = end;
		int key = a[i];
		while(i<j) {
			while(i<j && key < a[j]) {
				j--;
			}
			a[i] = a[j];
			while(i<j && key > a[i]) {
				i++;
			}
			a[j] = a[i];
		}
		a[i] = key;
		quickSort(a,start, i-1);
		quickSort(a, i+1, end);
		
		
	}
	
	public static void mergeSort(int a[], int start,  int end) {
		int mid = (start + end) / 2;
		if(start < end) {
			mergeSort(a, start, mid);
			mergeSort(a, mid+1, end);
			merge(a, start, mid, end);
		}
	}
	
	public static void merge(int aa[], int start, int mid, int end) {
		int[] tmpa = new int[mid-start + 2];
		int[] tmpb = new int[end-mid + 1];
		
		int i;
		for(i=0; i<tmpa.length -1 ; i++) {
			tmpa[i] = aa[start+i];
		}
		tmpa[i] = Integer.MAX_VALUE;
		int j;
		for(j=0; j<tmpb.length-1; j++) {
			tmpb[j] = aa[mid+j+1];
		}
		tmpb[j] = Integer.MAX_VALUE;
		
		int a=0;
		int b=0;
		for(int k=start; k<=end;k++) {
			System.out.println(b);
			if(tmpa[a] < tmpb[b]) {
				aa[k] = tmpa[a];
				a++;
			}else{
				aa[k] = tmpb[b];
				b++;
			}
		}
	}

	public static void main(String[] args) {
		int a[] = {9,8,2,7,6,5,4,3,1};
//		bubbleSort(a);
		mergeSort(a, 0, a.length-1);
		for(int i:a) {
			System.out.print(i + " ");
		}
	}

}
