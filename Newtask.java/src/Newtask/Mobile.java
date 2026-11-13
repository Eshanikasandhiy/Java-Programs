package Newtask;
class Phone{
	private String brand;
	private int price;
	void setphone(String brand,int price) {
		this.brand=brand;
		this.price=price;
	}
	String getbrands() {
		return brand;
		
	}
	int getprice() {
		if(0>price) {
			System.out.println("Don't allow the negative price");
		}
		return price;
			
	}
}

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p1=new Phone();
		p1.setphone("vivo",-300);
		System.out.println(p1.getbrands());
		System.out.println(p1.getprice());

	}

}
