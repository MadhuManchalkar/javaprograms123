package Program_practice;
class m
{
	m()
	{
		System.out.println("madhu");
	}
	 r obj=new  r();
	class r
	{
		r()
		{
			System.out.println("manasa");
		}
		void show()
		{
			System.out.println("raamu");
		}
	}
}
public class Innerandouterclass {

	public static void main(String[] args) {
		m obj1=new m();
		obj1.obj.show();
		
		

	}

}
