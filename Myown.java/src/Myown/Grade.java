package Myown;
import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		// TODO Auto-generated method stub
		int mark=sc.nextInt();
		if(mark>89 && mark<100) {
			System.out.println("A Grade");
		}
		else if(mark>75 && mark<88) {
			System.out.println("B Grade");
		}
		else if(mark>50 && mark<74) {
			System.out.println("C Grade");
		}
		else if(mark>35&& mark<49) {
			System.out.println("D Grade");
		}
		else {
			System.out.println("Fail");
		}

	}

}
