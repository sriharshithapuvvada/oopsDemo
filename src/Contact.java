// example for method overloading
public class Contact {
    void CreateContact() {
    	System.out.println("contacts");
    }
    void CreateContact(String name)
    {
    	System.out.println("name:"+name);
    }
    void CreateContact(long num1,long num2) {
    	System.out.println("number 1:"+num1);
    	System.out.println("number 2:"+num2);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contact c=new Contact();
		c.CreateContact();
		c.CreateContact("abc");
		c.CreateContact(1233447814L, 3424657648L);

	}

}
