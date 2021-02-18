import java.util.*;
public class Student {
  String name;
  int rollno;
  String course;
  int marks;
  Scanner s;
  Student(){
	  System.out.println(" Student details");
	  name=" ";
	  rollno=0;
	  marks=0;
	  course="ece";
	  s=new Scanner(System.in);
   }
  Student(String n,int a,String c,int m)
  {
	  name=n;
	  rollno=a;
	  marks=m;
	  course=c;
	 
  }
  public void input()
  {
	  System.out.println("enter the name");
	  name=s.next();
	  System.out.println(" enter the roll no");
	  rollno=s.nextInt();
	  System.out.println("enter the  marks");
	  marks=s.nextInt();
  }
  public void print() {
	  
	  System.out.println("name:"+name);
	  System.out.println("rollno:"+rollno);
	  System.out.println("course:"+course);
	  System.out.println("marks:"+marks);
  }
}
