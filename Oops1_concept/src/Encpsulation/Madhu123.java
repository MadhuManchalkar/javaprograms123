package Encpsulation;
class Emp
{
	int a;
	private int b;
	void display(int b)
	{
		this.b=b;
	}
	int show()
	{
		return b;
	}
}

public class Madhu123 {

	public static void main(String[] args) {
		Emp obj=new Emp();
		obj.a=10;
		System.out.println(obj.a);
		obj.display(20);
		int d=obj.show();
		System.out.println(d);
		
		
	}

}
