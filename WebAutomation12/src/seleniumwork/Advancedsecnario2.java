package seleniumwork;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Task2
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
	
	static void login()
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
	static void createuser1() 
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
	static void createuser3() 
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();	
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.name("firstName")).sendKeys("Neela");
			Thread.sleep(2000);
			obrowser.findElement(By.name("lastName")).sendKeys("POOja");
			Thread.sleep(2000);
			obrowser.findElement(By.name("email")).sendKeys("pooja@gmail.com");
			Thread.sleep(2000);
			obrowser.findElement(By.name("username")).sendKeys("neelaKolhar");
			Thread.sleep(2000);
			obrowser.findElement(By.name("password")).sendKeys("neela123");
			Thread.sleep(2000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("neela123");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createuser2() 
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();	
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.name("firstName")).sendKeys("megha");
			Thread.sleep(2000);
			obrowser.findElement(By.name("lastName")).sendKeys("mahendra");
			Thread.sleep(2000);
			obrowser.findElement(By.name("email")).sendKeys("mahenda@gmail.com");
			Thread.sleep(2000);
			obrowser.findElement(By.name("username")).sendKeys("meghamanchalkar");
			Thread.sleep(2000);
			obrowser.findElement(By.name("password")).sendKeys("mahemdra123");
			Thread.sleep(2000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("mahemdra123");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
		

static void modifyusrer1()
{
	try
	{
		obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();	
		Thread.sleep(2000);
	obrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
	Thread.sleep(1000);
	obrowser.findElement(By.name("password")).sendKeys("madhu123");
	Thread.sleep(1000);
	obrowser.findElement(By.name("passwordCopy")).sendKeys("madhu123");
	Thread.sleep(1000);
	obrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
	Thread.sleep(1000);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
static void modifyusrer2()
{
	try
	{
		obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();	
		Thread.sleep(2000);	
	obrowser.findElement(By.xpath("//*[@id='usersManagementBodyTagId']")).click();
	Thread.sleep(2000);
	obrowser.findElement(By.name("password")).sendKeys("madhu1234");
	Thread.sleep(2000);
	obrowser.findElement(By.name("passwordCopy")).sendKeys("madhu1234");
	Thread.sleep(1000);
	obrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
	Thread.sleep(1000);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
static void modifyusrer3()
{
	try
	{
		obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();	
		Thread.sleep(2000);	
	obrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
	Thread.sleep(2000);
	obrowser.findElement(By.name("password")).sendKeys("madhu12345");
	Thread.sleep(2000);
	obrowser.findElement(By.name("passwordCopy")).sendKeys("madhu12345");
	Thread.sleep(1000);
	obrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
	Thread.sleep(1000);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
  static void login3()
{
	try
	{
		obrowser.findElement(By.id("username")).sendKeys("neelaKolhar");
		Thread.sleep(1000);
		obrowser.findElement(By.name("pwd")).sendKeys("neela123");
		Thread.sleep(1000);
		obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(1000);
		obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
  static void login2()
  {
  	try
  	{
  		obrowser.findElement(By.id("username")).sendKeys("meghamanchalkar");
  		Thread.sleep(1000);
  		obrowser.findElement(By.name("pwd")).sendKeys("mahemdra123");
  		Thread.sleep(1000);
  		obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
  		Thread.sleep(1000);
  		obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
  			Thread.sleep(1000);
  	}
  	catch(Exception e)
  	{
  		e.printStackTrace();
  	}
  }
  static void login1()
  {
  	try
  	{
  		obrowser.findElement(By.id("username")).sendKeys("madhuramaanasa12");
  		Thread.sleep(1000);
  		obrowser.findElement(By.name("pwd")).sendKeys("manager1234");
  		Thread.sleep(1000);
  		obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
  		Thread.sleep(1000);
  		obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
  			Thread.sleep(1000);
  	}
  	catch(Exception e)
  	{
  		e.printStackTrace();
  	}
  }
  static void delet1()
  {
	  try
	  {
		  obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();	
			Thread.sleep(1000);
			
	  obrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
	  Thread.sleep(1000);
	  obrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
	  Thread.sleep(1000);
	  Alert oAlert=obrowser.switchTo().alert();
		String content=oAlert.getText();
		System.out.println(content);
		oAlert.accept();
		Thread.sleep(1000);
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
  }
  static void deletuser2()
  {
	  try
	  {
		  obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();	
			Thread.sleep(1000);
		  obrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
		  Thread.sleep(1000);
		  obrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
		  Thread.sleep(1000);
		  Alert oAlert=obrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(1000);
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
  }
  static void deletuser3()
  {
	  try
	  {
		  obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();	
			Thread.sleep(1000);
		  obrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
		  Thread.sleep(1000);
		  obrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
		  Thread.sleep(1000);
		  Alert oAlert=obrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(1000);
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
  }

  static void login33()
  {
  	try
  	{
  		obrowser.findElement(By.id("username")).sendKeys("neelaKolhar");
  		Thread.sleep(1000);
  		obrowser.findElement(By.name("pwd")).sendKeys("neela123");
  		Thread.sleep(1000);
  		obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
  		Thread.sleep(1000);
  		
  	}
  	catch(Exception e)
  	{
  		e.printStackTrace();
  	}
  }
    static void login22()
    {
    	try
    	{
    		obrowser.findElement(By.id("username")).sendKeys("meghamanchalkar");
    		Thread.sleep(1000);
    		obrowser.findElement(By.name("pwd")).sendKeys("mahemdra123");
    		Thread.sleep(1000);
    		obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
    		Thread.sleep(1000);
    		
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    static void login11()
    {
    	try
    	{
    		obrowser.findElement(By.id("username")).sendKeys("madhuramaanasa12");
    		Thread.sleep(1000);
    		obrowser.findElement(By.name("pwd")).sendKeys("manager1234");
    		Thread.sleep(1000);
    		obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
    		Thread.sleep(1000);
    		
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
public class Advancedsecnario2 {

	public static void main(String[] args) {
		Task2.show();
		Task2.navigate();
		Task2.login();
		Task2.minimizeFlyOutWindow();
		Task2.createuser1();
		Task2.logout();
		
		Task2.login1();
		Task2.createuser2();
		Task2.logout();
		
		Task2.login2();
		Task2.createuser3();
		Task2.logout();
		
		Task2.login3();
		Task2.logout();
		
		Task2.login22();
		Task2.modifyusrer3();
		Task2.logout();
		
		Task2.login33();
		Task2.logout();
		
		Task2.login11();
		Task2.modifyusrer2();
		Task2.logout();
		
		Task2.login22();
		Task2.logout();
		
		Task2.login();
		Task2.modifyusrer1();
		Task2.logout();
		
		Task2.login11();
		Task2.logout();
		
		Task2.login22();
		Task2.deletuser3();
		Task2.logout();
		
		Task2.login11();
		Task2.deletuser2();
		Task2.logout();
		
		Task2.login();
		Task2.delet1();
		Task2.logout();
		
		
	}

}
