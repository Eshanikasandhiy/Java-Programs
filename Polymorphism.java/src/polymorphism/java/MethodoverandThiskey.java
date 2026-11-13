package polymorphism.java;
class StudentDetails{
	String name;
	int age;
	double mark;
	void display(String name,int age,double mark ) {
		this.name=name;
		this.age=age;
		this.mark=mark;
		System.out.println("Am from Parent Name: "+name);
	}
}
class StudentPrint extends StudentDetails{
	String name;
	int age;
	double mark;
	void display(String name,int age,double mark ) {
		super.display(name, age, mark);
		this.name=name;
		this.age=age;
		this.mark=mark;
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Mark: "+mark);
	}
	
}

public class MethodoverandThiskey {

	public static void main(String[] args) {
		StudentPrint s1=new StudentPrint();
	StudentPrint s2=new StudentPrint();
		System.out.println("Student Details");
		System.out.println("________________");
		s1.display("anu", 25, 60);
		s2.display("Sandhya", 22,100);
       // System.out.println(s1.display("Sandhiya",23,100));
        //s1.display("Priya",23, 90);
	}}