package inheritance;
class User1
{
	User1()
	{
		System.out.println("madhu");
	}
	User1(int age)
	
	{
		System.out.println(age);
	}
}
class User2 extends User1
{
	User2(int age)
	{
		super(age);
	}
	User2()
	{
		super();
	}
	void show(int age)
	{
		
		System.out.println(age);
	}
}

public class Inhertance_exampl1 {

	public static void main(String[] args) {
		User2 obj=new User2(24);
		User2 obj2=new User2(); 
	   obj.show(23);

	}

}
