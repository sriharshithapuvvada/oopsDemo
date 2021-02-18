package com.valuemomentum.training.concurrency;

public class HeavyWorkRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("doing heavy processing- START"+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			DOBProcessing();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		System.out.println("doing heavy processing -END"+Thread.currentThread().getName());
	}
	private void DOBProcessing() throws Exception {
		Thread.sleep(5000);
	}
	

}
