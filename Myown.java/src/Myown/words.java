package Myown;
import java.util.Scanner;
import java.util.Arrays;


public class words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String n1=sc.next();
		String n2=sc.next();
		n1.toLowerCase();
		n2.toLowerCase();
		char[] a=n1.toCharArray();
		char[]b=n2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(Arrays.equals(a,b)) {
			System.out.println("This is Anagram");
		}
		else {
			System.out.println("This not Anagram");
		}
		

	}

}
