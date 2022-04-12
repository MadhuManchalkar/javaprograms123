package seleniumwork;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Sample
{
	public static WebDriver obrowser=null;
	static void show()
	{
		
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Madhu\\eclipse-workspace\\WebAutomation12\\Libararies\\Driver\\chromedriver.exe");
			obrowser=new ChromeDriver();
			Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class WebDriverdemo {

	public static void main(String[] args) {
		Sample.show();
		//Sample.navigate();
		//Sample.logic();
		//Sample.minimizeFlyOutWindow();
		//Sample.createuser();
		//Sample.delet();
	//	Sample.deleteUser();
		//Sample.logout();
	}

}



