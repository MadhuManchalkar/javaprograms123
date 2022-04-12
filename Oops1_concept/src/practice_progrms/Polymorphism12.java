package practice_progrms;
abstract class Madhu
{
	abstract void display();
}
class Madhu1 extends Madhu
{
	void display()
	{
		System.out.println("madhu");
	}
	void show()
	{
		System.out.println("madhu1");
	}
}
interface Madhu3
{
	abstract void show3();
}
interface Madhu4
{
	abstract void show4();
}
class Madhu5 implements  Madhu4,Madhu3
{
	public void show4()
	{
		System.out.println("madhu");
	}
	public void show3()
	{
		System.out.println("megha");
	}
	
}

public class Polymorphism12 {

	public static void main(String[] args) {
		
		Madhu obj=new Madhu1();
		obj.display();
		Madhu5 obj1=new Madhu5();
		obj1.show3();
		obj1.show4();
		
	}

}
