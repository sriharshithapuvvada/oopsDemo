import java.util.*;
class Trainee     //class declaration
{
	int tid;
	String tname;
	String technology;
	float salary;
	//define methods
	void input()
	{
	   Scanner s=new Scanner(System.in);
	   System.out.println("enter  id,name, technology,salary of the trainee");
	   tid=s.nextInt();
	   tname=s.next();
	   technology=s.next();
	   salary=s.nextFloat();
	   
	}
	float calculate()
	{
		float stipend=salary-200;
		return stipend;
	}
	void display() 
	{
		System.out.println("trainee details:");
		System.out.println("trainee id:"+tid);
		System.out.println("trainee name:"+tname);
		System.out.println("trainee technology:"+technology);
		//System.out.println("trainee salary:"+salary);
		
	}
}
public class TestTrainee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Trainee t1=new Trainee();  //creation of object
      Trainee t2=new Trainee();
      t1.input(); //method calls
      t2.input();
      t1.display();
      t2.display();
      float s1=t1.calculate();          // return type
      System.out.println("calculate:"+s1);
     float s2=t2.calculate();          // return type
       System.out.println("calculate:"+s2);

	}

}
