package Encpsulation;
abstract class EDS
{
	abstract void display();
}
class nn extends EDS
{
	void display()
	{
		System.out.println("madhu");
	}
}
class mm extends EDS
{
	
	void display()
	{
		System.out.println("megha");
	}
}
class nn1 extends EDS
{
	void display()
	{
		System.out.println("mohana");
	}
}
public class Madhu1 {

	public static void main(String[] args) {
		EDS p;
		p=new  nn();
		p.display();
		
		p=new mm();
		p.display();
		
		p=new nn1();
		p.display();
		

	}

}
