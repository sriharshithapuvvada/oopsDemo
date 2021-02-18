//1-2-2021 assignment4
//salary program
import java.util.*;

class Sal{
	Scanner s=new Scanner(System.in);
	float salary=s.nextFloat();
	int workinghours=s.nextInt();
	
	
	void getinfo() {
		System.out.println("salary="+salary);
		System.out.println("number of hours per day="+workinghours);
	}
	void Addsal() {
		if(salary<500)
		{
			salary+=10;
		}
	}
	void Addwork() {
		if(workinghours>6)
		{
			salary+=5;
		}
	}
	void display() {
		System.out.println("salary="+salary);
	}
}
public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Sal s=new Sal();
     s.getinfo();
     s.Addsal();
     s.Addwork();
     s.display();
	}

}
