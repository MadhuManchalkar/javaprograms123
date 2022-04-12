package pom_work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Example345
{
	public static WebDriver obroswer=null;
	public static  Actime_page11 opage=null;
	static void dispay()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Demoworkspace\\POM\\Library\\Driver\\chromedriver.exe");
			obroswer=new ChromeDriver();
			opage=new Actime_page11(obroswer);
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
		obroswer.get("http://localhost/login.do");
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void Login()
	{
		try
		{
			opage.Useraname().sendKeys("admin");
			opage.password().sendKeys("manager");
			opage.Loginpage().click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class Demo2 {

	public static void main(String[] args) {
		Example345.dispay();
		Example345.navigate();
		Example345.Login();

	}

}
