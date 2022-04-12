package abstract1;
abstract class College
{
	abstract void college_name();
	abstract void  city_name();
	void braches(String braches[])
	{
		for(int i=0;i<braches.length;i++)
		{
			System.out.println(braches[i]);
		}
	}
}
class College1 extends College
{
	void college_name()
	{
		System.out.println("BGMIT");
	}
	void city_name()
	{
	System.out.println("Mudhol");	
	}
	
	
}
public class Example1 {

	public static void main(String[] args) {
		String a[]= {"ec","cs","mech"};
		College obj=new College1();
		obj.city_name();
		obj.college_name();
		obj.braches(a);
	}

}
