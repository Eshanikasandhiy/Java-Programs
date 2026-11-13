package demo;
import java.util.Scanner;

public class Open {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println(a>b&&a>c);
		System.out.println("A is Greater than");
		System.out.println(b>a&&b>c);
		System.out.println("b is greater than");
		System.out.println(c>a&&c>b);
		System.out.println("C is greater than");
		String max=b<a?"True":"false";
		System.out.println("smallest numbr is"+max);
		
	
	}

}
