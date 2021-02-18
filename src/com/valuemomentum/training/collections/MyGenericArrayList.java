package com.valuemomentum.training.collections;
import java.util.*;
public class MyGenericArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<String> strLst = new ArrayList<String>();
		   
	      strLst.add("alpha");   // compiler checks if argument is of type String
	      strLst.add("beta");
	   
	      for (int i = 0; i < strLst.size(); ++i) {
	         String str = strLst.get(i);   // compiler inserts the downcasting operator (String)
	         System.out.println(str);
	      }
	   
	     // strLst.add(new Integer(1234));  // compiler detected argument is NOT String, issues compilation error

	   strLst.add("Gama");
	   System.out.println(strLst.get(2));
	   
	}

}
