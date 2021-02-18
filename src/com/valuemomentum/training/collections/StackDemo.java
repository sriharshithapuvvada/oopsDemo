package com.valuemomentum.training.collections;
import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Stack<String> s=new Stack<String>();
  s.push("abc");
  s.push("asd");
   s.push("fgh");
   s.push("qwe");
   System.out.println(s);
   s.pop();
   Iterator<String> itr=s.iterator();
while(itr.hasNext())
	{
	System.out.println(itr.next());
	}
System.out.println("peek="+s.peek());
	}

}
