package Myown;
import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		int max=sc.nextInt();
		//int largest=0;
		int min=sc.nextInt();
		int c=sc.nextInt();
		if(max==min&&min==c) {
			System.out.println("All Number equals");
		}
		if(max>min && max>c){
			System.out.println(max);}
		else if(min>max && min>c) {
			System.out.println(min);}
		else if(c>max && c>min) {
					System.out.println("c is biggest nuber"+c);
		}
		}
		
		

	}

