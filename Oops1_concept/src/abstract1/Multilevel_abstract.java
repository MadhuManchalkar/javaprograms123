package abstract1;
abstract class Student123
{
	abstract void display();
	abstract void display1();
}
class Student1234 extends Student123
{
	void display()
	{
		System.out.println("madhu");
	}
	void display1()
	{
		System.out.println("maanasa");
	}
	void show_age()
	{
		System.out.println("student age"+23);
	}
}
class Student12345 extends Student1234
{
	void display()
	{
		System.out.println("raamu");
	}
	void display1()
	{
		System.out.println("ramanagouda");
	}
}

public class Multilevel_abstract {

	public static void main(String[] args) {
		Student12345 obj=new Student12345();
				obj.display();
		obj.display1();
		obj.show_age();
			
				

	}

}
