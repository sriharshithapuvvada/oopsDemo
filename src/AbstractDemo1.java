// example for abstract 

abstract class Shape{
	String objectname="";
	Shape(String name){
		this.objectname=name;
	}
	public void moveTo(int x,int y)
	{
		System.out.println(this.objectname+" "+"has been moved to"+"x= "+x+"and y="+y);
	}
	abstract public double area();
	abstract public void draw();
}
class Rectangle1 extends Shape{
	int length,width;
	Rectangle1(int length,int width,String name){
		super(name);
		this.length=length;
		this.width=width;
		
	}
	public void draw() {
		System.out.println("rectangle has been drawn");
	}
	public double area() {
		return (double)(length*width);
	}
}
class circle extends Shape{
	double pi=3.14;
	int radius;
	circle(int radius,String name){
		super(name);
		this.radius=radius;
	}
	public void draw() {
		System.out.println("circle has been drawn");
	}
	public double area() {
		return (double)(pi*radius*radius);
	}
}
public class AbstractDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*Rectangle1 r=new Rectangle1(1,2,"a");
		r.draw();
		double x=r.area();
		System.out.println("area of rectangle="+x);
		circle c=new circle(2,"c");
		c.draw();
		double y=c.area();
		System.out.println("area of circle="+y);*/
		Shape react=new Rectangle1(2,3,"Rectangle");  //upcasting
		System.out.println("area of rectangle="+react.area());
		react.moveTo(1,2);
		System.out.println(" ");
		Shape cir=new circle(1,"circle");
		System.out.println("area of circle="+cir.area());
		cir.moveTo(2,4);
		
		
		

	}

}
