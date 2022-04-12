package Static_programs;
class Overload
{
	static void display(int age)
	{
		System.out.println(age);
	}
	static void display(int age,int marks)
	{
		System.out.println(age+" "+marks);
	}
	static void display(String name)
	{
		System.out.println(name);
	}
}

public class Static_overload {

	public static void main(String[] args) {
		Overload.display(23);
		Overload.display("madhu");
		Overload.display(24, 91);
		

	}

}
