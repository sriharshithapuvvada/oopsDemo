package com.valuemomentum.training.inputoutput;
import java.io.*;
public class Persist {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
Student s=new Student(1,"rani");
FileOutputStream fout=new FileOutputStream("c:/demo/f1.txt");
ObjectOutputStream out= new ObjectOutputStream(fout);
out.writeObject(s);
out.flush();
System.out.println("sucess");


	}

}
