package com.valuemomentum.training.collections;
import java.util.*;
import java.util.Map.Entry;
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashMap<Integer,String> languages=new HashMap<>();
    languages.put(1, "java");
    languages.put(2, "python");
    languages.put(3, "mongodb");
    languages.put(4, "javaScript");
    System.out.println("hashmap="+languages);
    String value=languages.get(1);
    System.out.println("value at index1="+value);
    System.out.println("values at index1="+languages.get(3));
    System.out.println("keys="+languages.keySet());
    System.out.println("values="+languages.values());
    System.out.println("key/value mappings="+languages.entrySet());
    languages.replace(2, "c++");
    
    System.out.println("keys=");
    for(Integer key:languages.keySet()) {
    	System.out.print(key+" "+languages.get(key));
    
    System.out.print(",");
   // System.out.println(languages.values());
    }
    System.out.print("\nEntries: ");
    for (Entry<Integer, String> entry : languages.entrySet()) {
      System.out.print(entry);
      System.out.print(", ");
    }
	}

}
