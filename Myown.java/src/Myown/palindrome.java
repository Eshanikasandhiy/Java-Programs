package Myown;

public class palindrome {

	public static void main(String[] args) {
		String name="madam";
		String reverse="";
		for(int i=name.length()-1;i>=0;i--) {
			reverse=reverse+name.charAt(i);	
		}
		System.out.println(reverse);
		if(name.equals(reverse)) {
			System.out.println("this is Palindrome");
		}
		else {
			System.out.println("This Not Palindrome");
		}
		
		
		

	}

}
