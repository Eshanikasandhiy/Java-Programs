package Encasulation;
class Bank{
	private int balanc;
	void setdisplay(int amount) {
		balanc=amount;
	}
	int getdisplay() {
		return balanc;	}
}

public class Balance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1=new Bank();
		b1.setdisplay(20000);
		int a=b1.getdisplay();
		System.out.println(a);
		

	}

}
