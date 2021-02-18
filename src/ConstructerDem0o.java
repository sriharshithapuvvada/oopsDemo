
public class ConstructerDem0o {
	int id;
	ConstructerDem0o(){   //Default constructer
		System.out.println(" in constructer");
		id=10;
		
	}
	void display() {
		System.out.println(id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructerDem0o obj1=new ConstructerDem0o();
		ConstructerDem0o obj2=new ConstructerDem0o();
		obj1.display();
	}

}
