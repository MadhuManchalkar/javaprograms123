package inheritance;
class Animal
{
	void display()
	{
		
		System.out.println("madhu");
		
	}
}
class Animal1 extends Animal
{
	void display1()
	{
		System.out.println("Maanas");
	}
}
class Animal2 extends Animal
{
	void dispaly3()
	{
		System.out.println("Raamu");
	}
}
class Anima123  extends Animal2
{
	void displY345()
	{
		System.out.println("Ramanagouda");
	}
}
public class Hybrid_inheritance {

	public static void main(String[] args) {
		Animal1 obj=new Animal1();
		obj.display();
		obj.display1();
		Anima123 obj1=new Anima123();
		obj1.display();
		obj1.displY345();
		obj1.dispaly3();
		
	}

}
