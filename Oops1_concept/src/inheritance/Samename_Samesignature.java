package inheritance;
class demo1
{
	void display(int age)
	{
		System.out.println(age);
	}
}
class demo2 extends demo1
{
	
	void display(int age)
	{
		
		System.out.println(age);
	}
}
public class Samename_Samesignature {

	public static void main(String[] args) {
		demo2 obj=new demo2();
		obj.display(24);
        obj.display(23);
	}

}
