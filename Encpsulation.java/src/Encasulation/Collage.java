package Encasulation;
class collagedetils{
	private String collagename;
	private String location;
void setdisplay(String collagename,String location) {
	this.collagename=collagename;
	this.location=location;
}
String getcollagename() {
	return collagename;
}
String getlocation() {
	return location;
}
}

public class Collage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		collagedetils c1=new collagedetils();
		c1.setdisplay("Madurai Kamaraj UnvierCity", "Nagamalaipudukottai");
		System.out.println(c1.getcollagename());
		System.out.println(c1.getlocation() );

	}

}
