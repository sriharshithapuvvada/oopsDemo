package com.valuemomentum.training.collections;
import java.util.*;
public class ComparatorDemo {

	public static void main(String[] args) {
	ArrayList<Student5> a=new ArrayList<Student5>();
	Student5 s1=new Student5(1,"Walter white","newyork",23);
	Student5 s2=new Student5(2,"hank","los vegas",45);
	Student5 s3=new Student5(5,"jessi pinkman","los angeles",78);
	Student5 s4=new Student5(4,"Gustavoo","mexico",1);
	a.add(s1);
	a.add(s2);
	a.add(s3);
	a.add(s4);
	System.out.println("Forever breaking Bad fan");
	//System.out.println(a);
	for(int i=0;i<a.size();i++) {
		System.out.println(a.get(i));
	}
	Collections.sort(a, new SortByMarks());
	
	System.out.println("**********Sorted Array List by Roll No:**********");
			for (int i=0; i<a.size(); i++)
        System.out.println(a.get(i));

	/* Collections.sort(a,new SortByName());
	System.out.println("**********Sorted Array List by Name:**************");
	for (int i=0; i<a.size(); i++)
System.out.println(a.get(i));	*/
	
	}

}
