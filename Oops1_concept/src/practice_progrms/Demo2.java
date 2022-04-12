package practice_progrms;
abstract class User22
{
	abstract void display();
 
}
class b extends  User22
{
	
	
	void display()
	{
	
		System.out.println("manas");
	}
	void dispaly23()
	{
		System.out.println("madhara");
	}
}
class c extends b
{
	
	void dipaly12345()
	{
		System.out.println("mummy");
	}
}

	


public class Demo2 {

	public static void main(String[] args) {
		 c obj=new  c();
		 obj.display();
		 obj.dispaly23();
		obj.dipaly12345();
		
		 

	}

}
