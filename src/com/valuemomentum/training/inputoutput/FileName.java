package com.valuemomentum.training.inputoutput;
import java.io.*;
import java.util.Date;
public class FileName {

	public static void main(String[] args) {
		File f=new File("Hello.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("file is created");
			}
			else
			{
			System.out.println("file is not created");
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("name of the file= "+f.getName());
		System.out.println("path of the file="+f.getPath());
		System.out.println("file last modified= "+new Date(f.lastModified()));
		System.out.println("parent directory= "+f.getParent());
		System.out.println("size of the file= "+f.length());

	}

}
