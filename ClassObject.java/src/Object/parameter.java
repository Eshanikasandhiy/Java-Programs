package Object;
class parame{
	void show(String name,int age) {
		System.out.println("your name:"+name);
		System.out.println("your age is:"+age);
	}
	void show1(String school,int idno) {
		System.out.println("School  name is:"+school);
		System.out.println("Id number is:"+idno);
	}
	void show2(String add,int pincode) {
		System.out.println("your address:"+add);
		System.out.println("Your pinode :"+pincode);
	}
	void show3(int mbno,int parenno) {
		System.out.println("your mobil number:"+mbno);
		System.out.println("your parent number:"+parenno);
	}
	
}

public class parameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parame p1=new parame();
		p1.show("Eshanika",4);
		p1.show1("Lakshmi school",102);
		p1.show2("Nagamalai pudukottai",625019);
		p1.show3(235567,23450);

	}

}
