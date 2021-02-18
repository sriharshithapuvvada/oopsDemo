package com.valuemomentum.training.exceptionhandling;

public class StringBufferDemo1 {

	public static void main(String[] args) {
StringBuffer buf=new StringBuffer("jamesgosling");
System.out.println("length= "+buf.length());
System.out.println("the capacity of string= "+buf.capacity());  // capacity will be length+16 extra characters
// System.out.println("the reversed string= "+buf.reverse());
System.out.println("the substring= "+buf.substring(0, 5));
// returns string from starting index to ending index-1
buf.replace(5, 10, "java");
System.out.println("the replaced string = "+buf);
buf.delete(2, 5);
System.out.println(" the deleted string = "+buf);
	}

}
