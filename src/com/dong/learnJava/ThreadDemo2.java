package com.dong.learnJava;

public class ThreadDemo2 extends Thread{
	
	private int countDown = 10;
	

	@Override
	public void run() {
        while (countDown-- > 0) {  
            System.out.println("#" + this.getName() + "(" + countDown + ")");  
        }  
	}


	public static void main(String[] args) {
		//完全是两个独立的东西
        new ThreadDemo2().start();  
        new ThreadDemo2().start(); 
	}

}
