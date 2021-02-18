package com.valuemomentum.training.inputoutput;
import java.io.*;
public class Dpersist {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
   ObjectInputStream in=new ObjectInputStream(new FileInputStream("c:/demo/f1.txt"));
   Student s=(Student)in.readObject();
   System.out.println(s.id+" "+s.name);
   in.close();
	}

}
