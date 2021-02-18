package com.valuemomentum.training.inputoutput;
import java.io.*;
public class BufferedReaderExp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		  InputStreamReader r=new InputStreamReader(System.in);    
		    BufferedReader br=new BufferedReader(r);            
		    System.out.println("Enter your name and age");    
		    String name=br.readLine();  
		    int age=Integer.parseInt(br.readLine());
		    System.out.println("name= "+name+" age= "+age);    

	}

}
