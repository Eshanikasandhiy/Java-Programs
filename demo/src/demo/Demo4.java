package demo;
import java.util.Scanner;
public class Demo4 {
	public static void main(String[]args) {
		Scanner san=new Scanner(System.in);
		System.out.println("Enter Amount");
		int unit=san.nextInt();
		int bill=0;
		
		if(unit<0) {
			System.out.println("Invalid Unit");
	
		}
		else if(unit<100) {
			
			bill=unit*2;
			System.out.println("100 Unit Below:"+bill);
		}
		else if(unit>100) {
			bill=(100*2)+(unit-100)*3;
			System.out.println("100 Unit Above:"+bill);
		}
		else if(unit>=200) {
			
			System.out.println("200 Unit Above :"+bill);
			
		}
	}

}
