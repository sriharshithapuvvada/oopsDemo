//1-2-2021 assignment 3
// find the area of the rectangle using return statment
import java.util.*;
class Area{
	int ReturnArea(int l,int b) {
		int area;
		area=l*b;
		return area;
	}
}
public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a=new Area();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the length=");
		int l=s.nextInt();
		System.out.println("enter the breadth=");
		int b=s.nextInt();
		int x=a.ReturnArea(l, b);
		System.out.println("area="+x);
		
     }

}
