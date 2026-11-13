package Abstract;
 abstract class vehicle{
	 abstract void display();
	 void show() {
		 System.out.println("vehicle stoped");
	 }
	
}
 class Car extends vehicle{
	 void display() {
		 System.out.println("car is start into key");
		 
	 }
 }
 class Bike extends Car{
	 void display() {
		 System.out.println("bike run very fast ");
	 }
 }

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car v1=new Car();
		v1.display();
		v1.show();
		vehicle v2=new Bike();
		v2.display();
		v2.show();

	}

}
