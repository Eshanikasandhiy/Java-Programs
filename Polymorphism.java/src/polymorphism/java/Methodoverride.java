package polymorphism.java;
class Rectanle{
	double hight;
	double weight;
	double display(double hight,double weight) {
		this.hight=hight;
		this.weight=weight;
		return hight*weight;
	}
	void show() {
		System.out.println(hight);
		System.out.println(weight);
	}
	
}
class shap extends Rectanle{
	double hight;
	double weight;
	double display(double hight,double weight) {
		super.display(11.2,5.3);
		this.hight=hight;
		this.weight=weight;
		return hight*weight;
	}
	void show() {
		System.out.println(hight);
		System.out.println(weight);
		
	}
	
}
class Size extends shap{
	double hight;
	double weight;
	double display(double hight,double weight) {
		super.display(12.3, 6.7);
		this.hight=hight;
		this.weight=weight;
		return hight*weight;
	}
	void show() {
		System.out.println(hight);
		System.out.println(weight);
		
	}
	
	
}
class Color extends Size{
	double hight;
	double weight;
	double display() {
		super.display(13.3,8.1);
		System.out.println(hight);
		System.out.println(weight);
		return hight*weight;
		
		
	}}
	

public class Methodoverride {

	public static void main(String[] args) {
		Color c1=new Color();
		c1.hight=10.3;
		c1.weight=20.3;
		
		
		
		// TODO Auto-generated method stub

	}

}
