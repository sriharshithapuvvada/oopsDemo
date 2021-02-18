package com.valuemomentum.training.collections;
import java.util.*;
public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Map<Integer,Book> Mapbook=new HashMap<>();

     Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);

     Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);

     Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
     Mapbook.put(1, b1);
     Mapbook.put(2, b2);
     Mapbook.put(3, b3);
     for(Map.Entry<Integer, Book>e:Mapbook.entrySet()) {
    	 int key=e.getKey();
    	 Book v=e.getValue();
    	 System.out.println("book "+key+" details");
    	 System.out.println(v.id+" "+v.name+" "+v.author+" "+v.publisher+" ");
     }
     

     
	}

}
