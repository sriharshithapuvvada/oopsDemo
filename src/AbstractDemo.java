// example for abstract class

abstract class animal{   // abstract class acts as a base class
	abstract void makeSound();
	public void eat() {
		System.out.println("i can eat");
	}
}
class Cat1 extends animal{
	public void makeSound() {
		System.out.println("bark bark");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Cat1 d=new Cat1();
      d.makeSound();
     // d.eat();
      
	}

}
