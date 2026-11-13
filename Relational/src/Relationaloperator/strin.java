package Relationaloperator;
import java.util.Scanner;
//import javax.swing.plaf.synth.SynthOptionPaneUI;
public class strin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String emp="sandhiya";
		String reverse="";
		for(int i=emp.length()-1;i>=0;i--) {
			reverse=reverse+emp.charAt(i);		
		System.out.println(reverse);
		}
		
		String s1="java";
		String s2=new String("Python programme");
		if(s1.equals(s2)) {
			System.out.println("Both are equals");
		}
			else {
				System.out.println("Both are not equals");
			}
		System.out.println("s2  first position  :"+s2.charAt(0));
		System.out.println("s2  last position   :"+s2.charAt(s2.length()-1));
		
		String text = "hello";
		if (text.isEmpty()) {
		System.out.println("String is empty");
		} else {
		System.out.println("String is not empty");}
		System.out.println("Enter name");
		Scanner san=new Scanner(System.in);
		String name=san.nextLine();
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
	}

}
