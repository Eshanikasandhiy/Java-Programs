package Relationaloperator;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="madam";
		String reverse=" ";
		System.out.println(name);
		for(int i=0;i<name.length();i++) {
			reverse=reverse+name.charAt(i);
			//System.out.println(reverse);
		}
		System.out.println(reverse);
		if(name==reverse) {
			System.out.println("It is palindrome");
		}
		else{
			System.out.println("it is not polindrome");
		}	
		
		
		

	}

}
