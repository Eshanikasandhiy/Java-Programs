package Relationaloperator;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="sandhiya";
		String reverse="";
		for(int i=name.length()-1;i>0;i--) {
			reverse=reverse+name.charAt(i);
		}
		System.out.println(reverse);
		if(name.equals(reverse)) {
			System.out.println("this not palindrome");
		}
		else {
			System.out.println("This not palindrome");
		}
		

	}

}
