package Object;
class withpara{
	int  add(int a,int b) {
		return a+b;
	}
	int sub(int a,int b,int c) {
		return a-b-c;
	}
	String name(String s1) {
		return s1;
	}
}

public class withparamaterreturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		withpara w1=new withpara();
		int a=w1.add(57, 67);
		int b=w1.sub(17, 33, 43);
		String n=w1.name("Priya");
		System.out.println(a);
		System.out.println(b);
		System.out.println(n);

	}

}
