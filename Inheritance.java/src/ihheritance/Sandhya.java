package ihheritance;
class vehicle{
	String vehiName;
	int modal;
	//first method
	void display(String vehiName,int modal) {
		this.vehiName=vehiName;
		this.modal=modal;		 
	}
	
	void show()
	{
		System.out.println(vehiName);
		System.out.println(modal);
	}
}

class car extends vehicle{
		String carName="YAMAGA";
		int cmodal=2021;
		void display() 
		{
			super.display(vehiName,modal);
		}
		void disshow()
		{
			System.out.println(carName);
			System.out.println(cmodal);
		}
	}
class desing extends vehicle{
		String vhiColor="Red";
		String carColor="Blue";
		void display() {
			super.display(vehiName,modal);
	}
		void show3() 
		{
			System.out.println(vhiColor);
			System.out.println(carColor);
		}
}

public class Sandhya{

	public static void main(String[] args) {
		car c1=new car();
		// c1.show();
		c1.display("Tesala", 2026);
		c1.disshow();
		desing d1=new desing();
		d1.display("TATA", 2016);
		d1.show3();
		

	}

}
