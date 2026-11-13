package demo;
import java.util.Scanner;

public class nwarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner san= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=san.nextInt();
		System.out.println("Enter the n1");
		int n1=san.nextInt();
		System.out.println("Enter he n2");
		int n2=san.nextInt();
		System.out.println("Enter he n3");
		int n3=san.nextInt();
		num+=5;
		num=num+5;
		System.out.println("Addition Update value:"+num);
		n1-=10;
		System.out.println("Subtration Update value :"+n1);
		n2*=2;
		System.out.println("Multplicton update Value :"+n2);
		n3/=4;
		System.out.println("Division update Value :"+n3);
	}}
