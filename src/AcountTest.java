// upcasting
class Account{
	String name;
	protected Double balance;
	public Account(String name, Double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public Double getBalance() {
		return balance;
	}
	void deposit(double amt) {
		balance += amt;
		System.out.println("depositing="+amt);
	}
  void withdrawal(double amt) {
	  balance-=amt;
	  System.out.println("withdrawal="+amt);​​​​
  }
  

}
public class AcountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
