package ihheritance;
class Arts{
	private  String stuName="faithma";
	public String subject="Commerce ,economic,accounts";
	
	void subje() {
		System.out.println("Arts Student Name:"+stuName);
		System.out.println("Subject names is :"+subject);
		
	}
	
}
class Scince extends Arts{ 
	private String  scistuName="preveenKumaar";
	public String  sciSubject="java,Bio maths,Computer Science ";
	
	void display() {
		System.out.println("Science Student Name:"+scistuName);
		
		System.out.println("Science Subjects: "+sciSubject);
	}
	}
class design extends Scince{
	private String destuName="Radha";
	public String desSubject="Make up,Nails Arts,Mehandi design Advanced";
	
	void sho() {
		System.out.println("Desinging Student Name:"+destuName);
		System.out.println("Desinging Stident subject :"+desSubject);
	}
	
	}
public class MultiLevel {

	public static void main(String[] args) {
		design d1=new design();
		d1.subje();
		d1.display();
		d1.sho();
		
	}
		// TODO Auto-generated method stub

	}


