package practice_progrms;
abstract class MR
{
	abstract void display();
}
class MR1 extends MR
{
	void display()
	{
		System.out.println("dancer");
	}
}
class MR2 extends MR
{
	void display()
	{
		System.out.println("singer");
	}
}
class MR3 extends MR
{
	void display()
	{
		System.out.println("teacher");
	}
}
public class Poly12 {

	public static void main(String[] args) {
		MR obj;
		obj=new MR1();
		obj.display();
		obj=new MR2();
		obj.display();
		obj=new MR3();
		obj.display();

	}

}
