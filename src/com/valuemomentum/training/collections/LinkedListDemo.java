package com.valuemomentum.training.collections;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> languages = new LinkedList<>(); // add elements in the linked l
		languages.add("Java");

	     languages.add("Python");

		languages.add("JavaScript");

		languages.add("Java");

		System.out.println("LinkedList: " + languages); // change elements at index 3
    languages.set(3, "Kotlin");

	System.out.println("Updated LinkedList: " + languages);

	}

}
