package Encasulation;
class Eprivate {
	private int age;
	private String name;
	private String add;
	private int mobno;
	private int pincode;
	
	public void setdisplay(int age,String name,String add,int mobno,int pincode) {
		this.age=age;
		this.name=name;
		this.add=add;
		this.mobno=mobno;
		this.pincode=pincode;
	}
	public int getage(){
		return age;
}
	public String getname() {
		return name;
		
	}String getadd(){
		return add;
	}int getmobno(){
		return mobno;
	}int getpincode()
	{
		return pincode;
	}
	}

public class Privatevariableacces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eprivate e1=new Eprivate();		e1.setdisplay(23, "muthumari", "simmakkal", 678946, 12345);
		System.out.println(e1.getage());
		System.out.println(e1.getname());
		System.out.println(e1.getadd());
		System.out.println(e1.getmobno());
		System.out.println(e1.getpincode());
		//System.out.println();

	}

}
