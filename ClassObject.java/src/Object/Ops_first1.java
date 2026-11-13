package Object;
import java.util.Scanner;


public class Ops_first1 {
	Scanner sc=new Scanner(System.in);
	//System.out.println("Enter the student name");
	String stname;
	int age;
	int idname;
	int a=10;
	void display() {
		for(int i=0;i<=10;i++) {
		System.out.println(stname);
		System.out.println(age);
		System.out.println(idname);
		System.out.println(a+=2);
		System.out.println(a-=3);}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the Student name");
		
		Ops_first1 op=new Ops_first1();
		System.out.println("Enter student Name");
		op.stname=sc.next();
		System.out.println("Enter age");
		op.age=sc.nextInt();
		System.out.println("Enter id name");
		op.idname=sc.nextInt();
		op.display();
		}}
		
		