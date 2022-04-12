package interface1;
interface Animal
{
	   void dislay_name(String name);
}
interface Animal1 extends  Animal
{
	void display_name1(String name);
}
class Animal13 implements Animal1
{
	public   void dislay_name(String name)
	{
		System.out.println("animal name"+name);
		
	}
	public void display_name1(String name)
	{
		System.out.println("another name"+name);
	}
	void display1(String food_name)
	{
		System.out.println("Food name"+food_name);
	}
}
public class Eample1 {

	public static void main(String[] args) {
		Animal13 obj=new Animal13();
		obj.dislay_name("dog");
		obj.display_name1("cat");
		obj.display1("doggy food");

	}

}
