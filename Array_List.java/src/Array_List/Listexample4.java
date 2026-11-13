package Array_List;
import java.util.*;
public class Listexample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> language=new ArrayList<>();
		language.add("Java");
		language.add("c");
		language.add("c++");
		language.add("Python");
		System.out.println(language);
		//set method
		language.set(0,"c");
		language.set(1, "c++");
		language.set(2,"python");
		language.set(3,"Java");
		System.out.println(language);
		//get method
		language.get(3);
		System.out.println(language);
		// remove
		language.remove(3);
		System.out.println(language);
		// again add method use pannure
		language.add("Java Script");
		System.out.println(language);
		//set method


	}

}
