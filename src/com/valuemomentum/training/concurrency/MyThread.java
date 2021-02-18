package com.valuemomentum.training.concurrency;

public class MyThread extends Thread{

	public static void main(String[] args) {
		MyThread obj=new MyThread();
		obj.create();
		System.out.println("this is the main thread");
	}

	private void create() {
		Thread obj1= new Thread(this);
		obj1.start();
		
	}
	
	public void run() {
		while(true) {
			 {
				 try {
			 
				System.out.println("This is the child thread");
				Thread.sleep(500);
				 }
				 catch(Exception e) {
					 
				 }
			
		}
	}
	
	}
}
