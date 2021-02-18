package com.valuemomentum.training.exceptionhandling;

public class Tester {
int e_id;
String name;
float Salary;
public Tester(int e_id, String name, float salary) {
	super();
	this.e_id = e_id;
	this.name = name;
	Salary = salary;
}

@Override
public String toString() {
	return "Tester [e_id=" + e_id + ", name=" + name + ", Salary=" + Salary + "]";
}


}
