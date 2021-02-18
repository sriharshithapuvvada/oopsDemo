package com.valuemomentum.training.concurrency;
class First {
	synchronized public void display(String msg) {
		System.out.print("["+msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("]");
	}
}
class Second extends Thread{
	String msg;
	First fobj;
	public Second(String msg, First fobj) {
		super();
		this.msg = msg;
		this.fobj = fobj;
		start();
		}
	public void run() {
	fobj.display(msg);
	
}
}
public class SynchronizeDemo {

	public static void main(String[] args) {
		First f1=new First();
		Second s1=new Second("Welcome",f1);
		Second s2=new Second("java",f1);
		Second s3=new Second("programming",f1);
   // race condition 3 methods calling one object to run one code at a time it is known as synchronization
	}

}
