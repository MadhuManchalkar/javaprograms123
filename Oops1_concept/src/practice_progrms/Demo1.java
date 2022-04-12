package practice_progrms;
class User1
{
	void addition()
	{
		int a=10,b=20;
		int c=0;
		c=a+b;
		System.out.println(c);
	}
	void substraction(int i,int j)
	{
		int k=i+j;
		System.out.println(k);
	}
	int multiplication()
	{
		int a=10,b=20;
		int c=a+b;
		return c;
	}
	int multify(int a,int b)
	{
		int c=0;
		c=a+b;
		return c;
	}
}

public class Demo1 {

	public static void main(String[] args) {
		User1 obj=new User1();
		obj.addition();
		obj.substraction(10, 20);
		int c=obj.multiplication();
		System.out.println(c);
		int d=obj.multify(10, 40);
		System.out.println(d);
	
	}
}
