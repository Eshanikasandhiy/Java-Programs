package Newtask;
import java.util.Scanner;
class BankAplication{
	private String accountHolder;
	private int accountNo;
	public int deposit;
	public int withdraw;
	void setBank(String accountHolder,int accountNo,int deposit,int withdraw) {
		this.accountHolder=accountHolder;
		this.accountNo=accountNo;
		this.deposit=deposit;
		this.withdraw=withdraw;

	}
	String getAccountHolder() {
	return accountHolder;
		
	}
	int getAccountNo() {
		return accountNo;
	}
	int getDeposit() {
		return deposit-withdraw;
	}
	
}

public class Application {

	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		BankAplication b1=new BankAplication();
		System.out.println("Enter Deposit Amount:");
		int dep=c.nextInt();
		System.out.println("Enter the Withdrawl Amount:");
		int with=c.nextInt();
		b1.setBank("Meenatchi",124586, dep,with);
		int balance=b1.getDeposit();
		System.out.println("A/c Holder Name: "+b1.getAccountHolder());
		System.out.println("A/cNumber: "+b1.getAccountNo());
		System.out.println("Your Account Balance  :"+balance);
		// TODO Auto-generated method stub

	}

}
