package TestNg_Products;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Products12 {
	@Test
	public void display()
	{
		System.out.println("demo1");
	}
	@Test
	public void display1()
	{
		System.out.println("demo2");
	}
	@Test
	public static void display2()
	{
		System.out.println("demo3");
	}
	@BeforeClass
	public static void show()
	{
		System.out.println("show1");
	}
	@AfterClass
	public static  void  show1()
	{
		System.out.println("show2");
	}
	

}
