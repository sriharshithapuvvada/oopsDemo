package com.valuemomentum.training.inputoutput;
import java.io.*;
public class BufferdWriteDemo {

	public static void main(String[] args) {
		// Writing to a file using BufferedWriter in Java 

		try { 
		FileWriter writer = new FileWriter("c:/demo/name.txt",true); 
		BufferedWriter bwr = new BufferedWriter(writer);  

		bwr.write("James"); 
		bwr.write("\n"); // bwr.newLine();
		bwr.write("Hobert"); 
		bwr.write("\n");
		bwr.write("harshi");
		bwr.close(); 

		System.out.println("succesfully written to a file"); } 
		catch (IOException ioe) { 
		ioe.printStackTrace(); 

		}


	}

}
