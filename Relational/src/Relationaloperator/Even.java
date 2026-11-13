package Relationaloperator;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]num= {10,20,30,40,50,60,70,80};
		int even=0;
		int odd=0;
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
			if(num[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
			}
		System.out.println("this Even Number"+even);
		System.out.println("this odd Number"+odd);
	}
}
