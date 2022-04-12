package pom_work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class work
{
	public static WebDriver obrosswer=null;
	public static Acti_time_login_logout obj=null;
	static void chrome_broswe()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\Demoworkspace\\POM\\Library\\Driver\\chromedriver.exe" );
			obrosswer=new ChromeDriver();
			obj=new Acti_time_login_logout(obrosswer);
			Thread.sleep(1000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void naviagte()
	{
		try
		{
			obrosswer.get("http://localhost/login.do");
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logi_page()
	{
		try
		{
			obj.User_name().sendKeys("admin");
			obj.pass_word().sendKeys("manager");
			obj.logic_page().click();
			Thread.sleep(1000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	

}
public class pom_123 {

	public static void main(String[] args) {
		work.chrome_broswe();
		work.naviagte();
		work.logi_page();
		
	}

}
