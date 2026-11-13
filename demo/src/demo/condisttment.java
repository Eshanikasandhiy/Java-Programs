package demo;
import java.util.Scanner;

public class condisttment {

	public static void main(String[] args) {
		Scanner san=new Scanner(System.in);
		System.out.println("Enter the mark");
		int mark=san.nextInt();
		
		if(mark>=90&&mark<=100) {
			System.out.println("A Grade");
		}
		else if(mark>=75&&mark<=89) {
			System.out.println("b Grade");
		}
		else if(mark>=60&&mark<=74) {
			System.out.println("C Grade");
		}
		else if (mark>=35&&mark<=59) {
			System.out.println("D Grade");
		}
		else if(mark<=34) {
			System.out.println("fail");
		}
		else{
		System.out.println("Invalid marks");
	}

}
}