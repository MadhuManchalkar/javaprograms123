package mehods;
class  Demo5
{
	Demo6 obj1=new Demo6();
	void show()
	{
		System.out.println("madhu");
	}
	class Demo6
	  {
		Demo6()
		{
			int age=23;
			System.out.println(age);
			
		}
		void diaplay1()
		{
			System.out.println("madhumaanasa");
		}
		void show1()
		{
			System.out.println("manchalkar");
		}
		
	 }
}

public class Innerclass_outerClass {

	public static void main(String[] args) {
		Demo5 obj=new Demo5();
		obj.show();
		obj.obj1.diaplay1();
		obj.obj1.show1();

	}

}
