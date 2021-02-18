package com.valuemomentum.training.exceptionhandling;

public class ThrowsDemo {
	void Division() throws ArithmeticException{
		int a=45,b=0,rs;
		rs=a/b;
		System.out.println("\n\t the result is: "+rs);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ThrowsDemo t=new ThrowsDemo();
     try {
    	 t.Division();
     }
     catch(ArithmeticException Ex) {
    	 System.out.println("\n\t error: "+Ex.getMessage());
     }
     System.out.println("\n\t end of the program");
	}

}
