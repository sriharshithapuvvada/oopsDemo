// example for the sublist array list for nongeneric i.e; it contains all the data types

package com.valuemomentum.training.collections;
import java.util.*;
public class PlayerList {
     ArrayList playerarray;
     List subListObj;
     PlayerList(){
    	 playerarray=new ArrayList();
    	 subListObj=new ArrayList();
    	 
     }
     void add() {
    	 for(int ctr=0;ctr<5;ctr++) {
    		 playerarray.add(new Integer(ctr));
    	 
    	 }
    	 playerarray.add("matrin");
    	 playerarray.add("serena");
    	 playerarray.add("matrina");
    	 playerarray.add("serena");
    	 
     }
     void extract() {
    	 System.out.println("***************************"+"**************************");
    	 System.out.println("Extract a sublist"+"           enter the new list");
    	 System.out.println("***************************"+"**************************");
    	 System.out.println();
    	 subListObj=playerarray.subList(5, playerarray.size());
    	 System.out.println("New sublist from index 5 to"+playerarray.size()+"is="+subListObj);
    	 System.out.println();
     }
     void search() {
    	 System.out.println();

    	 System.out.println("************************************"+ "***********************");

    	 System.out.println("Search for an object and return "+ "the first and last position");

    	 System.out.println("*********************************"+ "***************************");

    	 System.out.println();
    	 System.out.println("first occurnce of the string"+"\"serena\"is at a position"+playerarray.indexOf("serena"));
    	 System.out.println("last occurnce of the string"+"\"serena\"is at a position"+playerarray.lastIndexOf("serena"));
    	 System.out.println();


     }
     void display() {

System.out.println("**********************"+ "****************");
System.out.println("Retrieve objects from the ArrayList");

System.out.println("*******************"+ "*******************");
System.out.println();

for(int ctr=0;ctr<playerarray.size();ctr++) {
	System.out.print(" " + playerarray.get(ctr));   // printing array list with for loop is good practice
}
System.out.println();
System.out.println(playerarray);  //without for printing array list
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayerList p=new PlayerList();
		p.add();
		p.extract();
		p.search();
		p.display();

	}

}
