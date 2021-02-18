package com.valuemomentum.training.concurrency;
class Test extends Thread{
	public void run() {
		System.out.println("thread "+Thread.currentThread().getId()+" is Running");
	}
}
public class MultiThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=8;
     for(int i=0;i<n;i++) {
    	 Test t=new Test();
    	 t.start();
     }
	}

}
