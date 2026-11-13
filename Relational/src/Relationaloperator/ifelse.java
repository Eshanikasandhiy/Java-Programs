package Relationaloperator;
import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		Scanner san=new Scanner(System.in);
		System.out.println("entr your number");
		int vlu=san.nextInt();
		if(vlu%3==0 && vlu%5==0 ) {
			System.out.println("Your Sscore always divide1");
		}
		else {
				System.out.println("Your scor not well");
			}
			
		}

	}

