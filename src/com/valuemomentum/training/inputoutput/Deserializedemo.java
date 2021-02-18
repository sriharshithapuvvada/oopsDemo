package com.valuemomentum.training.inputoutput;
import java.io.*;
public class Deserializedemo {

	public static void main(String[] args) {
		Employee e=new Employee();
		try {
			FileInputStream filein= new FileInputStream("c:/demo/employee.ser");
			ObjectInputStream in=new ObjectInputStream(filein);
			e=(Employee)in.readObject();
			in.close();
			filein.close();
		}
		catch(IOException i) {
			i.printStackTrace();
			return;
		}
		catch(ClassNotFoundException c) {
			System.out.println(" class not found");
			c.printStackTrace();
			return;
		}
		System.out.println("Desarilzable");
		System.out.println("name= "+e.name);
		System.out.println("number= "+e.number);
		System.out.println("adress= "+e.address);
		System.out.println("SSN= "+e.SSN);

	}

}
