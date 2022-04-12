package interace123;
interface a
{
	void display();
}
interface b
{
	void show();
}
class c implements a,b
{
	public void display()
	{
		System.out.println("demo1");
	}
	public void show()
	{
		System.out.println("demo2");
	}
}


public class Eaxmple1 {

	public static void main(String[] args) {
		c obj=new c();
		obj.display();
		obj.show();
	}
	

}
