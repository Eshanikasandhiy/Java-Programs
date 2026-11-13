package Relationaloperator;

public class strVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		String name="java full stack";
		int vowls=0;
		int count=0;
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			vowls++;
		
				}
				else {
					count++;
					
				}
			}System.out.println("enter vowels  :"+vowls);
			System.out.println("enter count  alues :"+count);
		}

	}

