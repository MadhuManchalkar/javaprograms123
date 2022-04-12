package seleniumwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Createuserexample
{
	static WebDriver obrowser=null;
	static void launch()
	{
		try
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhu\\eclipse-workspace\\WebAutomation12\\Libararies\\Driver\\chromedriver.exe");
		obrowser=new  ChromeDriver();
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	static void navigate()
	{
		try
		{
		obrowser.get("http://localhost/login.do");
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	static void login()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("admin");
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			obrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	static void createuser()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("admin");
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			obrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
public class Createuser {

	public static void main(String[] args) {
		Createuserexample.launch();
		Createuserexample.navigate();
		Createuserexample.login();
		Createuserexample.createuser();
		
	}

}
