
public class Time {
	int a,b,c;
	Time(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
		
	}
	void add(Time obj2)
	{
		this.a+=obj2.a;
		this.b+=obj2.b;
		this.c+=obj2.c;
		
	}
	void display() {
		if(this.c>=60)
		{
			this.b++;
			this.c=this.c-60;
		}
		if(this.b>=60)
		{
			this.a++;
			this.b=this.b-60;
		}
		if(this.a>=24)
		{
			
			this.a=this.a-24;
		}
		System.out.println(this.a+":"+this.b+":"+this.c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time obj1=new Time(10,45,04);
		Time obj2=new Time(15,55,59);
		obj1.add(obj2);
		System.out.println("the time added is:");
		obj1.display();
		

	}

}
