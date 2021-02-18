package com.valuemomentum.training.collections;
import java.util.*;
public class HashsetUserDefined {

	
	public static void main(String[] args) {
		Set<Employee> emp=new HashSet<Employee>();
		Employee e1=new Employee(1,"abc",567.85);
		Employee e2=new Employee(2,"tyu",56.85);
		Employee e3=new Employee(3,"ghj",56677.5);
		Employee e4=new Employee(4,"def",5890.85);
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		for(Employee e:emp) {
			System.out.println(e.id+" "+e.name+" "+e.sal);
		}
	}

}
