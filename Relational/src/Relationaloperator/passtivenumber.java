package Relationaloperator;
import java.util.Scanner;

public class passtivenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner san =new Scanner(System.in);
		//System.out.println("Enter the N1 value");
		
		int[]arr= {10,40,50,69,89,79,57,78,7};
		int largest=arr[0];
		int secondlargest=Integer.MIN_VALUE;
		int thirdlargest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondlargest=largest;
				thirdlargest=secondlargest;
				largest=arr[i];
			}
			else if(arr[i]>secondlargest){
				secondlargest=arr[i];
			}
			else if(arr[i]>thirdlargest) {
				thirdlargest=arr[i];
			}
			
		}
		System.out.println(largest);
		System.out.println(secondlargest);
		System.out.println(thirdlargest);
	}}