// final
class Student20
{
	private int rollno;
	private String name;
	static String college="BMS";
	
	public static void changeCollege()
	{
		college="SNIST";
		
	}
	public Student20(int r,String n)
	{
		rollno=r;
		name=n;
	}
	public void display()
	{
		System.out.println(rollno+" "+name+" " +college);
	}
	
}
public class TestFinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Student20.changeCollege(); // call static method without creating an object
		Student20 s1=new Student20(1,"abc");
		Student20 s2=new Student20(2,"bc");
		Student20 s3=new Student20(3,"c");
		s1.display();
		s2.display();
		s3.display();



	}

}
