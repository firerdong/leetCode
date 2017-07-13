package com.dong.learnJava;

public class VolatileDemo implements Runnable{
	private volatile int i = 1;
	
	public synchronized int getI() {
		return i;
	}
	
	public synchronized void add() {
		i++;
		i++;
		i++;
		i++;
		i++;
		i++;
		i++;
	}
	
	public void run() {
		while(true) {
			add();
		}
	}

	public static void main(String[] args) {
		VolatileDemo vd = new VolatileDemo();
		new Thread(vd).start();
		while(true) {
			int val = vd.getI();
			if((val % 2) == 0) {
				System.out.println(val);
				System.exit(0);
			}
		}
	}

}
