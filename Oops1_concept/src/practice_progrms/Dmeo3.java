package practice_progrms;
interface p
{
	void display();
}
class g implements p
{
	public void display()
	{
		System.out.println("madhu");
	}
	void show()
	{
		System.out.println("madhu");
	}
}

public class Dmeo3 {

	public static void main(String[] args) {
		p obj=new  g();
		 obj.display();
		
		
	}

}
