package Array_List;
import java.util.ArrayList;

public class ListExmple3 {

	public static void main(String[] args) {
		ArrayList<String>fruit=new ArrayList<>();
		fruit.add("Apple");
		fruit .add("Mango");
		fruit.add("Banana");
		fruit.add("Kiwi");
		fruit.add("apple");
		System.out.println("Fruit names :");
		System.out.println(fruit);
		String fruits=fruit.get(3);
		System.out.println(fruits);
		
		

	}

}
