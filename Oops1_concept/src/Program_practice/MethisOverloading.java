package Program_practice;
class Practice3
{
	 void display(String name)
	{
		System.out.println(name);
	}
}
class Practice4 extends Practice3
{
	
	 void display(String name1)
	{
		
		System.out.println(name1);
	}
}

public class MethisOverloading {

	public static void main(String[] args) {
		Practice3 obj=new Practice3();
		obj.display("madhu");
		
	}

	
}
