package Relationaloperator;
import java.util.Scanner; 

public class Taskke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner san=new Scanner(System.in);
		int n=san.nextInt();
		if(n>=0&&n%2==0) {
			System.out.println("Postive Even");
		}
		else if(n>=0&&n%2!=0) {
			System.out.println("postive odd");
		}
		else if (n<0&&n%2==0) {
			System.out.println("Negative Even");
		}
		else if(n<0&&n%2!=0) {
			System.out.println("Negative odd");
		}
		else {
			System.out.println("Zero-");
		}
		
		
	}}
	