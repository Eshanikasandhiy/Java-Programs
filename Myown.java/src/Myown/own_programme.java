package Myown;
import java.util.Scanner;

public class own_programme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Units");
		int unit=sc.nextInt();
		if(unit<0) {
			System.out.println("Invalid units");
		}else {
			double bill;
		
		if(unit<=100) {
			bill=unit*1.50;
			System.out.println(bill);
		}
		else if(unit<=200) {
			bill=unit*1.50
					+(unit-100)*2.50;
			}
		else {
			bill=unit*1.50
					+unit*2.50
					+(unit-200)*4.00;
			System.out.println(bill);
		}
		}
		
		
		
		

	}

}
