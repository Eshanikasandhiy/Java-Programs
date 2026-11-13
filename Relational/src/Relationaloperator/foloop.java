package Relationaloperator;
//import java.util.Scanner;
public class foloop {
	public static void main(String[] args) {
		//Scanner san=new Scanner(System.in);
		int sum=0;
		int []num= {45,60,50,78,90};
		for(int i=0;i<num.length;i++) {
		System.out.println(num[i]);
		sum+=num[i];
		}
		System.out.println(sum);
		double avg=sum/500;
		System.out.println(avg);
		

}}
