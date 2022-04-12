package polymorphism;
abstract class Person
{
	abstract void multiple_task();
}
class office_work extends Person
{
	 void multiple_task()
	 {
		 System.out.println("office work");
	 }
}
class Dancer extends Person
{
	 void multiple_task()
	 {
		 System.out.println("Dance");
	 }
}
class Singer extends Person
{
	 void multiple_task()
	 {
		 System.out.println("singing a song");
	 }
}
public class Poly_Example {

	public static void main(String[] args) {
		Person p;
		p=new office_work();
		p.multiple_task();
		
		
		p=new Dancer();
		p.multiple_task();
		
		p=new Singer();
		p.multiple_task();
	}

}
