package com.valuemomentum.training.inputoutput;
import java.io.*;
public class BufferedOutputDemo {

	public static void main(String[] args) throws IOException {
      FileOutputStream fout=new FileOutputStream("c:/demo/f1.txt");
      BufferedOutputStream bout=new BufferedOutputStream(fout);
      String s="Sachin�is�my�favourite�player";
      byte b[]=s.getBytes();
bout.write(b);
bout.flush();
bout.close();
fout.close();
System.out.println("sucess");

	}

}
