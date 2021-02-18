//  example for override
class Bank{
	int getRateofIntrest() {
		return 0;
	}
	class SBI extends Bank{
		int getRateofIntrest() {
			return 8;
		}
		
	}
	class ICICI extends Bank{
		int getRateofIntrest() {
			return 7;
		}
		
	}
	class AXIS extends Bank{
		int getRateofIntrest() {
			return 9;
		}
		
	}
}
public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      SBI s=new SBI();
      ICICI i=new ICICI();
      AXIS a=new AXIS();
      System.out.println(" sbi rate of intrset="+s.getRateofIntrest());
      System.out.println(" ICICI rate of intrset="+i.getRateofIntrest());
      System.out.println(" AXIS rate of intrset="+a.getRateofIntrest());
	}

}
