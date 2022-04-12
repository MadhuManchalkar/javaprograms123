package seleniumwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class Demo1
{
	   public static WebDriver oBrowser=null; 
	static void lauch()
	{
		
		try
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Madhu\\eclipse-workspace\\WebAutomation12\\Libararies\\Driver\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}
	static void launch1()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
public class Firefox12 {

	public static void main(String[] args) {
		Demo1.lauch();
		Demo1.launch1();

	}

}
