package com.valuemomentum.training.inputoutput;
import java.io.*;
public class DataStreamDemo {

	public static void main(String[] args) throws IOException {
		DataInputStream d=new DataInputStream(new FileInputStream("c:/demo/a.txt"));

		DataOutputStream out=new DataOutputStream(new FileOutputStream("/c:demo/test2.txt"));
		String count;
		while((count=d.readLine())!=null) {
			String u=count.toUpperCase();
			System.out.println(u);
			out.writeBytes(u+",");
		}
			d.close();
			out.close();
		}
        
	}


