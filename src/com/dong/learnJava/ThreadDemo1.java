package com.dong.learnJava;

public class ThreadDemo1 implements Runnable {
	private int countDown = 10;  
	
	public void run() {

			while (countDown-- > 0) {
				System.out.println(Thread.currentThread().getName() + "  countDown = " + countDown);
			}
		
	}
	
	public static void main(String[] args) {
		ThreadDemo1 td = new ThreadDemo1();
		
		//必须将Runnable附着到实际线程上执行
		//2个线程共享同一个目标对象
		new Thread(td).start();
		new Thread(td).start();
		
	}

}
