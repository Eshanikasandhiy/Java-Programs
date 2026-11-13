package polymorphism.java;
class BankAccount{
	String BankName;
	String interest;
	void disply(String BankName, String  interest) {
		this.BankName=BankName;
		this.interest=interest;
		System.out.println("Bank Name :"+BankName);
		System.out.println("Interest Rate :"+interest);
	}
}
class Sbi extends BankAccount{
	String BankName;
	String interest;
	void disply(String BankName, String  interest) {
		super.disply("sate Bank of India","70%");
		this.BankName=BankName;
		this.interest=interest;
		System.out.println("Bank Name :"+BankName);
		System.out.println("Interest Rate :"+interest);
	}
	
}


public class Bank {

	public static void main(String[] args) {
		Sbi s1=new Sbi();
		s1.disply("Reserve of India", "67%" );
		// TODO Auto-generated method stub

	}

}
