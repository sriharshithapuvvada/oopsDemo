package com.valuemomentum.training.collections;
import java.util.*;
public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Student> al=new ArrayList<Student>();
al.add(new Student(111,"fsg",29));
al.add(new Student(121,"sg",9));
al.add(new Student(11,"fs",20));
System.out.println(" elements before sorting=");
for(Student st1:al) {
	System.out.println(st1.roll+" "+st1.name+" "+st1.age);
}

Collections.sort(al);
System.out.println("elements after sorting=");
for(Student st:al) {
	System.out.println(st.roll+" "+st.name+" "+st.age);
}

}

}
