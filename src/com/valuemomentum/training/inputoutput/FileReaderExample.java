package com.valuemomentum.training.inputoutput;
import java.io.*;
public class FileReaderExample {

	public static void main(String[] args) {
		try {
			Reader reader = new FileReader("c:/demo/data.txt");
			int data=reader.read();  // return ascii value of character one by one
			while(data!=-1) {
				System.out.print((char) data);
				data=reader.read();
			}
			reader.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
