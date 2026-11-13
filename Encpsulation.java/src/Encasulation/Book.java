package Encasulation;
class Booklibary{
	private String bookname;
	private String issue;

void setdisplay(String bookname,String issue) {
	this.bookname=bookname;
	this.issue=issue;
}
String getbookname() {
	return bookname;
}
String getissue() {
	return issue;}
}
public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Booklibary b1=new Booklibary();
		b1.setdisplay("ponnien selvan","This  book 18 page is missed" );
		System.out.println(b1.getbookname());
		System.out.println(b1.getissue() );
		

	}

}
