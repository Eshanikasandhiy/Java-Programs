package Newtask;

public class Task {
	int id;
	String empName;
	int empAge;
	void display() {
		System.out.println("Enter Id Name :"+id);
		System.out.println("Employee Name :"+empName);
		System.out.println("Employee Age :"+empAge);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task t1=new Task();
		t1.id=1001;
		t1.empName="Guganesh";
		t1.empAge=43;
		t1.display();

	}

}
