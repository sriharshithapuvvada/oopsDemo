// example for final variable

public class Bike {
	final int speedlimit=90;//final variable
        void run() {
        	// speedlimit=400;   we cannot change i.e; we cannot over ride the final ststment
        	System.out.println("speed limit="+speedlimit);
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike obj=new Bike();

		obj.run();

	}

}
