package com.valuemomentum.training.collections;
import java.util.*;
public class ListItreatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("jim");
		al.add("abc");
		al.add("ghj");
		al.add(1, "ilu");
		System.out.println("element at 2nd position:"+al.get(2));
		ListIterator<String> itr=al.listIterator();
		System.out.println("traversing elements in forward direction...");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("traversing elemts in backward direction...");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
