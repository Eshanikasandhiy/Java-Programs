package Encasulation;
class Onlineshopiing{
	private int quantity;
	private int dress;
	private double offer;
	private int amount;
	void setdisplay(int quantity,int dress,double offer,int amount) {
		if(quantity>0||dress>5) {
			System.out.println("Get More Gift");
			
		}
		else {
			System.out.println("Not allowed gift");
		}
		this.quantity=quantity;
		this.dress=dress;
		this.offer=offer;
		this.amount=amount;
	}
	int getquantity() {
		return quantity;
	}
	int getdress() {
		return dress;
	}
	double getoffer() {
		return offer;
	}
	int getamount() {
		return amount;
	}
}

public class Validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Onlineshopiing o1=new Onlineshopiing();
		o1.setdisplay(0, 9, 5,2345);
		System.out.println(o1.getquantity());
		System.out.println(o1.getdress());
		System.out.println(o1.getoffer());
		System.out.println(o1.getamount());

	}

}
