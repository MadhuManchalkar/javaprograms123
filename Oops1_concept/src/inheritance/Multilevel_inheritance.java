package inheritance;
class User6
{
	void display()
	{
		System.out.println("madhu");
	}
}
class User7 extends User6
{
	void display1()
	{
		System.out.println("Manasa");
	}
}
class  User8 extends User7
{
	void display2()
	{
		System.out.println("raamu");
	}
}


public class Multilevel_inheritance {

	public static void main(String[] args) {
		User8  obj=new User8();
		obj.display();
		obj.display1();
		obj.display2();

	}

}
