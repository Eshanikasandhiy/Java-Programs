package Relationaloperator;
import java.util.Scanner;

public class switc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter number:");
		int day=sn.nextInt();
		switch(day) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thurday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
		default:
			System.out.println("invalid day");
			
		}
		sn.close();

	}

}
