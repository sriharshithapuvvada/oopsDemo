// 1-02-2021 assignment2
class Emp1{
	String name;
	int yoj;
	float salary;
	String address;
	Emp1(String n,int y,float s,String a ){
		name=n;
		yoj=y;
		salary=s;
		address=a;
		
	}
	public void print()
	{
     System.out.println(name+"   "+yoj+"            "+salary+"    "+address);
		
	}
}
public class Employee1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp1 e1=new Emp1("hjrf",1234,6788,"dfhdghdgnhd");
		Emp1 e2=new Emp1("hjrf",134,788,"dxhgdjfhdghdgnhd");
		System.out.println("name   "+"yearofjoining  "+"salary   "+"address");
		e1.print();
		e2.print();

	}

}