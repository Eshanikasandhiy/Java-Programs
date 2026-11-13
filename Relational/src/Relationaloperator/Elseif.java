package Relationaloperator;
import java.util.Scanner;

public class Elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner san=new Scanner(System.in);
		System.out.println("Enter the amount50");
		int amount=san.nextInt();
		if(amount<=50) {
			System.out.println("This amout given Biriyani");
			
		}
		else if(amount <=60) {
			System.out.println("Eat the chickn Rice");
		}
		else if(amount <=70) {
			System.out.println("Eat muttah Rice");
		}
		else if(amount <=80)
		{
			System.out.println("Eat mutton biriyani");
		}
		else {
			System.out.println("this amout don't eat the food");
		}

	}

}
