
public class Calculate {
void sum() {
	System.out.println("method overloading");
}
void sum(int a,int b) {
	System.out.println("sum is:"+(a+b));
}
void sum(float a,float b)
{
	System.out.println("sum is:"+(a+b));
}
void sum(String a,String b) {
	System.out.println("concatination is:"+(a+b));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate c=new Calculate();
		c.sum();
		c.sum(10, 20);
		c.sum(1.2f, 0.2f);
		c.sum("abc", "def");

	}

}
