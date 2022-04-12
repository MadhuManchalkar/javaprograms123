package pom_work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Example
{
	public static WebDriver obrowser=null;	
	public static Actitime_page opage=null;
	static void display()
	{
		try
		{
	 System.setProperty("webdriver.chrome.driver", "E:\\Demoworkspace\\POM\\Library\\Driver\\chromedriver.exe");
	 obrowser=new ChromeDriver();
	 opage=new Actitime_page(obrowser);
	 Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
	static void navigate()
	{
		try
		{
			obrowser.get("http://localhost/login.do");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginpage()
	{
		try
		{
			opage.name().sendKeys("admin");
			opage.password().sendKeys("manager");
			opage.Loginpage().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

public class Demo1 {

	public static void main(String[] args) {
		Example.display();
		Example.navigate();
		Example.loginpage();
		

	}

}
