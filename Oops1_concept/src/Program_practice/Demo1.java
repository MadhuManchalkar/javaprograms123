package Program_practice;
class Practice1
{
	Practice1()
	{
		this(23);
		System.out.println("madhu");
	}
	Practice1(String name,int age)
	{
		
		System.out.println(name+age);
	}
	Practice1(int id)
	{
		this("madhu",24);
		System.out.println(id);
	}
}

public class Demo1 {

	public static void main(String[] args) {
		Practice1 obj=new Practice1();
		
	}

}
