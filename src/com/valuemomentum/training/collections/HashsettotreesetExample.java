package com.valuemomentum.training.collections;
import java.util.*;
public class HashsettotreesetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Integer> hSetNumbers = new HashSet<Integer>();
        
        hSetNumbers.add(23);
        hSetNumbers.add(34);
        hSetNumbers.add(45);
        hSetNumbers.add(12);
        hSetNumbers.add(42);
        
        System.out.println("HashSet contains: " + hSetNumbers);
        
        /*
         * To convert HashSet to TreeSet, use the
         * TreeSet constructor and pass the HashSet object
         */
        
        TreeSet<Integer> tSetNumbers = new TreeSet<Integer>( hSetNumbers );
        tSetNumbers.add(25);
        tSetNumbers.remove(42);
        System.out.println("TreeSet contains: " + tSetNumbers);
    
	}

}
