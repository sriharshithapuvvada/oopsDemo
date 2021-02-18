
public class Doctor {
	protected String name;
	protected int id;
	protected String address;
	Doctor()
	{
	}
		Doctor(final String str,final int num,final String addr)
		{
			name=str;
			id=num;
			address=addr;
			
		}
		void display()
		{
			System.out.println("name="+name);
			System.out.println("id="+id);
			System.out.println("address="+address);
		}
	

}
