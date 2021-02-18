package com.valuemomentum.training.exceptionhandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String languages[]= {"c","c++","java","perl","python"};
		try {
			for(int i=1;i<=5;i++)
			System.out.println(languages[i]);
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());  // it will give only the messages
			e.printStackTrace();
		}

	}

}
