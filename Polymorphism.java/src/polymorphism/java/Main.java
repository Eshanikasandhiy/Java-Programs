package polymorphism.java;
class calculator{
	void add(int a,int b) 
	{
		System.out.println(a+b);
	}
	}
	

class calcu extends calculator{
	void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}

	
}
class cal extends calcu{
	void add(double a,double b) 
	{
		System.out.println(a+b);
	}
	
}

public class Main {
	public static void main(String[]args) {
		cal c1=new cal();
		c1.add(10, 20);
		c1.add(10, 20, 30);
		c1.add(15.2, 15.2);
		
	}

}
