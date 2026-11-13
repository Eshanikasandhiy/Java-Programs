package polymorphism.java;
class Student{
	int show(int a,int b ) {
		return a+b;
		
	}
}
class Teacher extends Student{
	double show(double a,double b,double c) {
		return a+b+c;
	}
}

public class Methodoveer {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Teacher t1=new Teacher();
		System.out.println(t1.show(10, 20));
		System.out.println(t1.show(23.6, 84.5, 65.7));

	}

}
