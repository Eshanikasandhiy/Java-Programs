package Encasulation;
class Motal{
	private  String hotalName;
	private String city;
	void setdisplay(String hotalName,String city) {
		this. hotalName= hotalName;
		this. city= city;
		
	}
	String gethotalName() {
		return hotalName;
	}
	String getcity(){
		return city;
	}
}

public class Hotal {

	public static void main(String[] args) {
		Motal m1=new Motal();
		m1.setdisplay("Saravana Bawn Hotal", "Madurai");
		System.out.println(m1.gethotalName());
		System.out.println(m1.getcity());
		
		// TODO Auto-generated method stub

	}

}
