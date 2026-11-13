package Relationaloperator;
import java.util.Scanner;

public class Hlo {

	public static void main(String[] args) {
	Scanner san=new Scanner(System.in);
	System.out.println("Enter the Student Name");
	String name= san.nextLine();
	System.out.println("Enter the studen marks");
	int m1=san.nextInt(3);
	double percenage=m1/3;
	for(int i=0;i<=m1;i++) {
		System.out.println(i);
	}
	
	if(m1<=35&&percenage>=70) {
		System.out.println("result pass");
	}

	}

}
