package com.valuemomentum.training.inputoutput;
import java.io.*;
public class BufferedReaderExample {

	public static void main(String[] args) {
		// Writing to a file using BufferedWriter in Java 

		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("c:/demo/countries.txt")));
			String line = "";
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not exists or insufficient rights");
			e.printStackTrace(); 
		} catch (IOException e) {
			System.out.println("An exception occured while reading the file");
			e.printStackTrace();		}				

	}

}
