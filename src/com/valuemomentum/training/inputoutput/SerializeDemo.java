package com.valuemomentum.training.inputoutput;
import java.io.*;
public class SerializeDemo {

	public static void main(String[] args) {
	Employee e=new Employee();
	e.name="abc";
	e.address="new york";
	e.number=101;
	e.SSN=111223334;
	try {
		FileOutputStream fileout=new FileOutputStream("c:/demo/employee.ser");
		ObjectOutputStream out=new ObjectOutputStream(fileout);
		out.writeObject(e);
		out.close();
		fileout.close();
		System.out.println("Serializable data is stored in c:/demo/employee.ser");
	}
	catch(IOException a) {
		a.printStackTrace();
	}
	}

}
