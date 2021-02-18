class Animal{
		String name;
		public void eat()
		{
			System.out.println("i can eat");
		}
	}
	class dog extends Animal{
		public void display()
		{
			System.out.println("my name is="+name);
		}
	}

public class AnimalTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    dog a=new dog();
    a.name="seg";
    a.display();
    a.eat();
    
	}

}
