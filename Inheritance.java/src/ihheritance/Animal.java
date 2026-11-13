package ihheritance;
import java. util.Scanner;
class Cityanimal{
	 String dogName;
	String dogYear;
	
}
class Forestanimal extends Cityanimal{
	
		
	 String DogName="Bubby";
	 String animaleat="line eat any animal";
	 void display() {
		 System.out.println(dogName);
		 System.out.println(dogYear);
		 System.out.println(DogName);
		 System.out.println(animaleat);}	} 

public class Animal {

	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter Dog Name :");
		String dog=sc.next();
		System.out.println("Ener dog Year :");
		String year=sc.next();
		
		// TODO Auto-generated method stub
		Forestanimal f1=new Forestanimal();
		f1.dogName=dog;
		f1.dogYear=year;
		f1.display();
		
		
		

	}	

}
