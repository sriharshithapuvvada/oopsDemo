//example for multiple catch blocks

package com.valuemomentum.training.exceptionhandling;

public class ExceptionMultipkeCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=10,n2=0,result=0;
		int a[]= new int[5];
		try {
			a[0]=0;
			a[1]=1;
			a[2]=2;
			a[3]=3;
			a[4]=4;
			a[5]=5;
			result=n1/n2;
			System.out.println("result of division="+result);
			
		}
	/*	catch(Exception e) {
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			System.out.println("Err:Divided by Zero");
		}  */
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Err:array index out of bound");
		}

	}

}
