package TestNg_Users;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Users {
	@Test
	public void display()
	{
		System.out.println("demo11");
	}
	@Test
	public void display1()
	{
		System.out.println("demo22");
	}
	@Test
	public static void display2()
	{
		System.out.println("demo33");
	}
	@BeforeClass
	public static void show()
	{
		System.out.println("show11");
	}
	@AfterClass
	public static  void  show1()
	{
		System.out.println("show22");
	}
	


}
