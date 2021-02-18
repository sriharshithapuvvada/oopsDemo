package com.valuemomentum.training.collections;
import java.util.*;
public class HashsetBasc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    HashSet<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        numbers.add(2);  //duplicate elements are not added
        System.out.println("HashSet: " + numbers);

        // Calling iterator() method
        numbers.add(7);
        numbers.add(null);  // it will not add duplicate numbers
        Iterator<Integer> iterate = numbers.iterator();
        System.out.print("HashSet using Iterator: ");
        // Accessing elements
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
       
	}

}
