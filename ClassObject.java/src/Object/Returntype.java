package Object;

class Student{
	int n1,n2;
	
	void show(int n1,int n2) {
		System.out.println(n1);
		System.out.println(n1-n2);
		
	}
}
public class Returntype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		
		s1.show(200,50);

	}

}
