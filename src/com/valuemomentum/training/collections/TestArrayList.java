// array list example
package com.valuemomentum.training.collections;

import java.util.*;


public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a1= new ArrayList<String>();
		a1.add("jim");
		a1.add("Michalel");
		a1.add("james");
		a1.add( "andy");
		Iterator itr=a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
  
	}

}
