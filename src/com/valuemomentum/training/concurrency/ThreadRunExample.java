package com.valuemomentum.training.concurrency;

public class ThreadRunExample {

	public static void main(String[] args) {
		Thread t1=new Thread(new HeavyWorkRunnable(),"t1");
		Thread t2=new Thread(new HeavyWorkRunnable(),"t2");
	System.out.println("starting runnable threads");
	t1.start();
	t2.start();
	System.out.println("runnable thread has been started");
    Thread t3=new Thread("t3");
	Thread t4=new Thread("t4");
	System.out.println("Starting my threads");
	t3.start();
	t4.start();
	System.out.println("My threads has been started");
	
	}
	

}
