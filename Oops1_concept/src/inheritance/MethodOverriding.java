package inheritance;
class Name1
{
	void dispaly()
	{
		System.out.println("madhii");
	}
}
class Name2 extends Name1
{
	
	void dispaly()
	{
		
		System.out.println("madhii123");
	}

}
public class MethodOverriding {

	public static void main(String[] args) {
		Name2 obj=new Name2();
		obj.dispaly();
	}

}

