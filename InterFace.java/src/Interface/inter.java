package Interface;
interface Animal{
	void sound();
}
class Dog implements Animal{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
	System.out.println("Dog is barks");	
	}
	
	
}
class Cat implements Animal{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("cat sound is meow");
	}
	
}

public class inter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog();
		d1.sound();
		Cat c1 =new Cat();
		c1.sound();

	}

}
