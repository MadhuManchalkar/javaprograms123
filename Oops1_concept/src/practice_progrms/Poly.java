package practice_progrms;
abstract class Person
{
	abstract void disply();
}
class n1 extends Person
{
	 void disply()
	{
		System.out.println("madhu");
	}
}
class n2 extends Person
{
	void disply()
	{
		System.out.println("megha");
	}
}

public class Poly {

	public static void main(String[] args) {
		Person p;
		p=new n1();
		p.disply();
		
		p=new n2();
		p.disply();
	}

}
