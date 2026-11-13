package Myown;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner san=new Scanner(System.in);
		
		int amount=20000;
		System.out.println("Enter Withdraw");
		int withdraw=san.nextInt();
		//int balance=amount;
		if(withdraw==0) {
			System.out.println("Invalid Withdraw");
		}else {
			double balance=amount;
			balance=balance-withdraw;
			System.out.println("Your balance is"+balance);
	
		}
		

	}

}
