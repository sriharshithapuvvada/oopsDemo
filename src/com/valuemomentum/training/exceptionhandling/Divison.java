package com.valuemomentum.training.exceptionhandling;

import java.util.*;
public class Divison {

	public static void main(String[] args) {
		int a,b,div;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the two integers=");
		a=s.nextInt();
		b=s.nextInt();
		try {
		div=a/b;
		System.out.println("result="+div);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception caught division by zero");
		}
		finally{
			s.close();
			System.out.println("in finally block");
			
		}

	}

}
