package com.valuemomentum.training.inputoutput;
import java.io.*;

public class WriterExample {

	public static void main(String[] args) {
		try {
			Writer w=new FileWriter("c:/demo/data.txt");
			String content="She sells sea shells in the sea";
			w.write(content);
			w.close();
			System.out.println("Data written");
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
