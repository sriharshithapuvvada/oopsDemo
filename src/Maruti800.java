class Car{
	public Car() {
		System.out.println("Class car");
	}
	public void vechileType()
	{
		System.out.println("vechile type car");
	}
}
 class Maruti extends Car{
	 public Maruti()
	   {
		System.out.println("Class Maruti");
	   }
	   public void brand()
	   {
		System.out.println("Brand: Maruti");
	   }
	   public void speed()
	   {
		System.out.println("Max: 90Kmph");
	   }
	}
	public class Maruti800 extends Maruti{

	   public Maruti800()
	   {
		System.out.println("Maruti Model: 800");
	   }
	  public void speed()
	   {
		System.out.println("Max: 80Kmph");
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Maruti800 obj=new Maruti800();
		 obj.vechileType();
		 obj.brand();
		 obj.speed();
	   
	}

}
