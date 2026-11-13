package Relationaloperator;
import java.util.Scanner;
public class nesed {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner san=new Scanner(System.in);
		System.out.println("Enter the baby month");
		int babymonth=san.nextInt();
		//System.out.println("Baby birth year");
		int year=san.nextInt();
		if(babymonth>=6) {
			if(year==2025|year==2026) {
				System.out.println("six month baby apporved adhaar");
			}else {
				System.out.println(" baby birth year");
			}}
		else {
				System.out.println("not eliible adhaar");
		}
		
		

	}

}
