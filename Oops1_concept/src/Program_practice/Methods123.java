package Program_practice;
class Practice2
{
	void add()
	{
		int a=10,b=20;
		int c=a+b;
		System.out.println(c);
	}
	void addition(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	int sub()
	{
		int a=10,b=20;
		int c=a-b;
		return c;
	}
	int substrction(int a,int b,int c)
	{
		c=a-b;
		return c;
	}
}
public class Methods123 {

	public static void main(String[] args) {
		Practice2 obj=new Practice2();
		obj.add();
		obj.addition(10, 20);
		int c=obj.sub();
		System.out.println(c);
		int d=obj.substrction(20, 10, 0);
		System.out.println(d);

	}

}
