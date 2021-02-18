import java.util.Scanner;

public class Asignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int rows=s.nextInt();
		for (int i = 1; i <= rows; i++) {
			// white spaces in the front of the numbers
			for(int j=i;j<rows;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<(i*2);k++)
			{
			System.out.print("*");
			}
			System.out.println(" ");
	}
		for (int i =rows-1; i>=1; i--) {
			// white spaces in the front of the numbers
			for(int j=i;j<rows;j++)
			{
				System.out.print(" ");
					//System.out.println(" ");
			
	}
			for(int k=1;k<(i*2);k++)
				System.out.print("*");
			System.out.println(" ");
		}
	}
	

}
