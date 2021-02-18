package com.valuemomentum.training.concurrency;
class Count1 implements Runnable
{
	Thread t;
   Count1()
   {
     t=new Thread(this,"my extending thread");
     System.out.println("my thread created" + this);
     t.start();
   }
   public void run()
   {
     try
     {
        for (int i=0 ;i<10;i++)
        {
           System.out.println("Printing the count " + i);
           Thread.sleep(1000);
        }
     }
     catch(InterruptedException e)
     {
        System.out.println("my thread interrupted");
     }
     System.out.println("My thread run is over" );
   }
}
public class ImplementsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Count1 cnt = new Count1();  // It extends the methods of thread class
		      try
		      {
		         while(cnt.t.isAlive())
		         {
		           System.out.println("Main thread will be alive till the child thread is live");
		           Thread.sleep(1500);
		         }
		      }
		      catch(InterruptedException e)
		      {
		        System.out.println("Main thread interrupted");
		      }
		      System.out.println("Main thread's run is over" );
		   
	}

}
