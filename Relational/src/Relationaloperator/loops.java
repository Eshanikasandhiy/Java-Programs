package Relationaloperator;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]num= {10,20,30,40,50};
		int Smallest=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]<Smallest) {
				Smallest=num[i];
			}
		}
		System.out.println(Smallest);
		
	}
		}


