
public class Complex {
	double real;
	double imaginary;
	public Complex(double r,double i)
	{
		real=r;
		imaginary=i;
	}
    void add(Complex obj2)
    {
    	this.real+=obj2.real;
    	this.imaginary+=obj2.imaginary;
    }
    void display() {
    	System.out.println(this.real+"+i"+this.imaginary);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Complex  obj1=new Complex(21.4,12.7);
      Complex  obj2=new Complex(2.7,2.9);
      obj1.add(obj2);   // objects can also be passed as arguments
      System.out.println("addition of the complex number is");
      obj1.display();
      
      
	}

}
