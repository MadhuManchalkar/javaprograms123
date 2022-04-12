package abstract1;
abstract class Laptoop
{
	abstract void laptonames();
	Laptoop(int price,String color)
	{
		System.out.println(price);
		System.out.println(color);
	}
	
}
class Laptop1 extends Laptoop
{
	void laptonames()
	{
		System.out.println("HP");
		System.out.println("dell");
	}
	Laptop1(int cost,String colour)
	{
	super(cost,colour);
	}
	void display()
	{
		System.out.println("madhu");
	}
}
public class ConstructorOverloading_abstract {

	public static void main(String[] args) {
		Laptop1 obj=new Laptop1(32000,"pink");
		obj.laptonames();
		obj.display();
	}

}
