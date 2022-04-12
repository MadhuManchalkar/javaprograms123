package Program_practice;
class code
{
	void  display()
	{
		System.out.println("madhu");
	}
}
class code1 extends code
{
	void display1()
	{
		System.out.println("maanasa");
	}
}
class code2 extends code1
{
	void display3()
	{
		System.out.println("raamu");
	}

}
public class Inheritence {
       public static void main(String[] args) {
		code2 obj=new code2();
		obj.display();
		obj.display1();
		obj.display3();
      }
}












