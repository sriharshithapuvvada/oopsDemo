// example for ststic method without creating an object
class Student200{
	private int roll;
	private String name;
	static String college="cbit";
	public static void ChangeCollege() {
		college="cmr";
	}
	public Student200(int r,String n){
		roll=r;
		name=n;
		
	}
	public void display() {
		System.out.println("roll no="+roll);
		System.out.println("name="+name);
		System.out.println("college="+college);
		System.out.println();
	}
}
public class TestStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student200.ChangeCollege(); // call static method without creating an object
		Student200 s1=new Student200(1,"abc");
		Student200 s2=new Student200(2,"bc");
		Student200 s3=new Student200(3,"c");
		s1.display();
		s2.display();
		s3.display();

	}

}
