package com.valuemomentum.training.collections;

import java.util.Comparator;

public class Student5 {
	int roll,marks;
	String name,add;
	public Student5(int roll, String name, String add,int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.add = add;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return "Student5 [roll=" + roll + ", marks=" + marks + ", name=" + name + ", add=" + add + "]";
	}
	
}
class SortByMarks implements Comparator<Student5>
{

	@Override
	public int compare(Student5 s1, Student5 s2) {
		// TODO Auto-generated method stub
		return s1.marks-s2.marks;
	}
	
class SortByName implements Comparator<Student5>{

	@Override
	public int compare(Student5 s1, Student5 s2) {
		// TODO Auto-generated method stub
		return s1.name.compareTo(s2.name);
	}

	
}
	
}
