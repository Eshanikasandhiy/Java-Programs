package Abstract;
abstract class Student{
	String name;
	int age;
	abstract void display();
	void show() {
		
		System.out.println("Student Name :"+name);
		System.out.println("Student age :"+age);
	}
}
class StudentId extends Student{
	String Dogname;
	int Dogage;
	void display() {
		System.out.println("dog is barking");

	}
	void show1() {
		System.out.println(Dogname);
		System.out.println(Dogage);
	}
	}
	

public class Absractvariable {

	public static void main(String[] args) {
		 StudentId s1=new  StudentId();
		 s1.name="SANSHIYA";
		 s1.age=26;
		 s1.Dogname="Chinu";
		 s1.Dogage=2;
		 s1.display();
		 s1.show();
		 s1.show1();
		 
		 
		
	}

}
