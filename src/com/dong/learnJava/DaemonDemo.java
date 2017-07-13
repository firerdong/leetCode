package com.dong.learnJava;

import java.util.concurrent.TimeUnit;

public class DaemonDemo implements Runnable{

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			Thread daemon = new Thread(new DaemonDemo());
			daemon.setDaemon(true);
			daemon.start();
		}
		
		try {
			//TimeUnit的好处是提高了可读性
			TimeUnit.MILLISECONDS.sleep(5000);//5000 * MILLISECONDS
			//TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void run() {
		try {
			while (true) {
				Thread.sleep(1000);
				System.out.println("#" + Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {// 后台线程不执行finally子句
			System.out.println("finally ");
		}
	}

}
