
public class Specalist extends Doctor {
	protected String specality;
	Specalist(){
	}
		Specalist(final String str,final int num,final String addr,final String special){
			super(str,num,addr);
			specality=special;
			
			
		}
		void display()
		{
			super.display();
			System.out.println("the specality is="+specality);
		}
	}
	class NonSpecalist extends Doctor{
		NonSpecalist(){
			
		}
		NonSpecalist(final String str,final int num,final String addr){
		super(str,num,addr);
	}
	}
		class TestDoctor{
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Specalist s=new Specalist("hmg",45,"jgsfadkua","yti");
   s.display();
   NonSpecalist ns=new NonSpecalist("hwdjf",23,"admfhg");
   ns.display();
   
	}

}
