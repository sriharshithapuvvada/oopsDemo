package com.valuemomentum.training.concurrency;
class MyThread3 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+"in control");
		}
}
}
public class YieldDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MyThread3 t=new MyThread3();
    t.start();
    for(int i=0;i<5;i++) {
    	Thread.yield();
    	// allowing the child thread to execute
    	
    	System.out.println(Thread.currentThread().getName()+" in control");
    }
	}

}
