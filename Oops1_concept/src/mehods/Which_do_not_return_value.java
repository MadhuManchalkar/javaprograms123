package mehods;
class Maths
{
	void add(int a,int b,int c)
	{
	c=a+b;
		System.out.println(c);
	}
	void substraction(int a,int b,int c)
	{
		
	 c=a-b;
		System.out.println(c);
	}
}

public class Which_do_not_return_value {

	public static void main(String[] args) {
		Maths obj=new Maths();
		obj.add(10,20,0);
		obj.substraction(40,30,0);
	}

}
