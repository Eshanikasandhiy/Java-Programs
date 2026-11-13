package Newtask;
import java.util.Scanner;
class BankAccount{
	private int balance;
	

void setbalance(int a) {
	this.balance=balance;
	
}
int getbalance() {
	if(balance>0) {
		System.out.println("your balance amount show");
	}
	else {
		System.out.println("Invalid amount");
	}
	return balance;
}
}
class Student {
	private String stName;
	private int age;
	private int mark;
	void setStudent(String stName,int age,int mark) {
		this.stName=stName;
		this.age=age;
		this.mark=mark;
	}
	String getStname() {
		return stName;
	}
	int getage() {
		return age;}
	int getmark() {
		return mark;
	}
	
}

public class Bank {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		// TODO Auto-generated method stub
		BankAccount b1=new BankAccount();
		int balance=sc.nextInt();
		b1.setbalance(20000);
		System.out.println("bANK Account Balace");
		System.out.println(b1.getbalance());
		Student s1=new Student();
		s1.setStudent("Kamatchu", 34, 78);
		System.out.println("Student informations");
		System.out.println(s1.getStname());
		System.out.println(s1.getage());
		System.out.println(s1.getmark());
		
		

	}

}
