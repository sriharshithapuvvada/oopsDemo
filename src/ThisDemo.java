
public class ThisDemo {
	int intvar;
	
 ThisDemo(int intvar)
 {
	 this.intvar=intvar;
	 System.out.println("this refernce:"+this);
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ThisDemo obj=new ThisDemo(8);
      System.out.println("object reference="+obj);
	}

}
