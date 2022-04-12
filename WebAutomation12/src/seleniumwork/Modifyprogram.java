package seleniumwork;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Modifyprogramtest
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
	static void navigate()
	{
		try
		{
			obrowser.get("http://localhost/login.do");
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logic()
	{
		{
			try
			{
				obrowser.findElement(By.id("username")).sendKeys("admin");
				obrowser.findElement(By.name("pwd")).sendKeys("manager");
                obrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div    ")).click();
    			Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
	}
		
}
	static void minimizeFlyOutWindow()
	{
		try
		{
			obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createuser() 
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();	
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.name("firstName")).sendKeys("maanasa");
			Thread.sleep(2000);
			obrowser.findElement(By.name("lastName")).sendKeys("Raamu");
			Thread.sleep(2000);
			obrowser.findElement(By.name("email")).sendKeys("maanasraamu@gmail.com");
			Thread.sleep(2000);
			obrowser.findElement(By.name("username")).sendKeys("madhuramaanasa12");
			Thread.sleep(2000);
			obrowser.findElement(By.name("password")).sendKeys("manager1234");
			Thread.sleep(2000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("manager1234");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUser()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=obrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyusrer()
	{
		try
		{
		obrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
		Thread.sleep(2000);
		obrowser.findElement(By.name("password")).sendKeys("megha123");
		Thread.sleep(2000);
		obrowser.findElement(By.name("passwordCopy")).sendKeys("megha123");
		Thread.sleep(1000);
		obrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}




public class Modifyprogram {

	public static void main(String[] args) {
		
		Modifyprogramtest.show();
		Modifyprogramtest.navigate();
		Modifyprogramtest.logic();
		Modifyprogramtest.minimizeFlyOutWindow();
		Modifyprogramtest.createuser();
		//Modifyprogramtest.modifyusrer();
		//Modifyprogramtest.deleteUser();
		//Modifyprogramtest.logout();
		

	}

}
