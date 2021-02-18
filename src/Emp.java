
public class Emp {
	int id;
	String name;
	Address address;
	public Emp(int id,String name,Address address) {
		this.id=id;
		this.name=name;
		this.address=address;  // aggregation 
	}
void display() {
	System.out.println(id+" "+name);
	System.out.println(address.city+" "+address.state+" "+address.country);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Address a1=new Address("hyd","telangana","india");
    Address a2=new Address("banglore","karnataka","india");
    Emp e1=new Emp(1,"abc",a1);
    Emp e2=new Emp(2,"xyz",a2);
    e1.display();
    e2.display();
	}

}
