package com.dong.learnJava;

public class SleepJoinDemo {

	public static void main(String[] args) {
		//启动线程sleep1 并睡眠1.5s 
        Sleeper sleep1 = new Sleeper("sleep1", 3000);  
        //启动线程sleep2 并睡眠1.5s
        Sleeper sleep2 = new Sleeper("sleep2", 3000);  
        //启动线程join1, 并等待sleep1 执行结束才执行。
        Joiner join1 = new Joiner("join1", sleep1);  
        //启动线程join2, 并等待sleep1 执行结束才执行
        Joiner join2 = new Joiner("join2", sleep1, 1000);  
        //把sleep2 叫醒
        sleep2.interrupt();

	}
}

class Sleeper extends Thread {
	int sleepTime;

	public Sleeper(String name, int _tm) {
		super(name);
		sleepTime = _tm;
		start();
	}

	@Override
	public void run() {
		try {
			sleep(sleepTime);
		} catch (InterruptedException e) {
			System.out.println(getName() + " interrupted ");
			return;
		}
		System.out.println(getName() + " awake");
	}
}

class Joiner extends Thread {
	Sleeper sleeper;
	long maxWaitTime;

	public Joiner(String name, Sleeper s) {
		this(name, s, 0);
	}
	
	public Joiner(String name, Sleeper s, long max) {
		super(name);
		sleeper = s;
		maxWaitTime = max;
		start();
	}

	@Override
	public void run() {
		try {
			sleeper.join(maxWaitTime);
		} catch (InterruptedException e) {
			System.out.println(getName() + " interrupted ");
			return;
		}
		System.out.println(getName() + " join completed");
	}
}

