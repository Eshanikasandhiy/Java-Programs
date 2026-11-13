package Encasulation;
class Busdetails{
	private String busname;
	private String route;
	void setBusdetails(String busname,String route) {
		this.busname=busname;
		this.route=route;	
	}
	String getbusname() {
		return busname;
	}
	String getroute() {
		return route;
	}
	
}
public class Bus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Busdetails b1=new Busdetails();
		b1.setBusdetails("AbhiBus", "Madurai to chennai");
		System.out.println(b1.getbusname());
		System.out.println(b1.getroute());

	}

}
