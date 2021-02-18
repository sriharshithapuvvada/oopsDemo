package com.valuemomentum.training.collections;
class Sample<t> {    //the class is declared in generic it can give any data type 
	private t data;
	

	public Sample(t data) {
	super();
	this.data = data;
}

	public t getData() {
		return data;
	}

	public void setData(t data) {
		this.data = data;
	}
	
	
}
public class GenericClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Sample<Integer> s1=new Sample<Integer>(12);  //creating a object of generic class of type integer
   // s1.setData(15);
    System.out.println("displaying genric type of integer="+s1.getData());   // displaying data from the generic type
    
    Sample<String> s2=new Sample<String>("hello");  //creating a object of generic class of type String
    //s2.setData("hello");
    System.out.println("displaying generic type of string="+s2.getData());   // displaying data from the generic type

    Sample<Float> s3=new Sample<Float>(123.7f);  //creating a object of generic class of type float
    //s3.setData(123.8f);
    System.out.println("displaying generic type of float="+s3.getData());   // displaying data from the generic type

	}

}
