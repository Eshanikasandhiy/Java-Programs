package Relationaloperator;
import java.util.Scanner;

class take {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		import java.util.Scanner;
		class VowelConsonant {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character");
		char ch = Character.toLowerCase(sc.next().charAt(0));
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println("this vowls"); 
		}
		else {
			System.out.println("this consonant");
		}
		System.out.println(ch);

	}

}}
