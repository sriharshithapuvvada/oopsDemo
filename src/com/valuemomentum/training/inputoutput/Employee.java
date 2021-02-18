package com.valuemomentum.training.inputoutput;

import java.io.Serializable;

public class Employee implements Serializable {
	public String name;
	public String address;
	public int number;
	public transient int SSN;
	public void mailcheck() {
		System.out.println("Mailing a check to ="+name+" "+address);
	}

}
