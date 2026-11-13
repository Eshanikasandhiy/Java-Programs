package Encasulation;
class Collectioncar{
	private  String carname;
	private int modal;
	private String carcolor;
	private double length;
	private int price;

void setdisplay(String carname,int modal,String carcolor,double length,int price) {
	this.carname=carname;
	this.modal=modal;
	this.carcolor=carcolor;
	this.length=length;
	this.price=price;
}
String getcarname() {
	return carname;
}
int getmodal() {
	return modal;
}
String getcarcolor() {
	return carcolor;
}
double getlength() {
	return length;
}
int getprice() {
	return price;
}void display(){
	System.out.println(getcarname());
	System.out.println(getmodal());
	System.out.println(getcarcolor());
	System.out.println(getlength());
	System.out.println(getprice());
}
}

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collectioncar c1=new Collectioncar();
		c1.setdisplay("tesala", 2026,"red",6.5,61);
		c1.display();

	}

}
