package inheritance;
class User9
{
	void display()
	{
		System.out.println("madhu");
	}
}
class User10 extends User9
{
	void display1()
	{
		System.out.println("maanasa");
	}
}
class User11 extends User9
{
	void display2()
	{
		System.out.println("Ramu");
	}
}

public class Hirerihial_inheritance {

	public static void main(String[] args) {
		User10 obj=new User10();
		obj.display();
		obj.display1();
		User11 obj1=new User11();
		obj1.display();
		obj1.display2();
	}

}
