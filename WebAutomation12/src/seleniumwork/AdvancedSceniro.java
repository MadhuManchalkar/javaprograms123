package seleniumwork;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Task
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
			obrowser.get("https://recruiter.monsterindia.com/v2/login.html?src=http%3A%2F%2Frecruiter.monsterindia.com%2Fv4%2Frecruiter%2Fsearch-results");
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
				obrowser.findElement(By.id("login")).sendKeys("monsterinternaldtest");
				obrowser.findElement(By.name("passwd")).sendKeys("7522RmmidZ");
                obrowser.findElement(By.id("submit1")).click();
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

}
public class AdvancedSceniro {

	public static void main(String[] args) {
		Task.show();
		Task.navigate();
		Task.login();
		
/*		Task.minimizeFlyOutWindow();
		
		Task.createuser1();
	    Task.createuser2();
		Task.createuser3();
		Task.logout();
		
		Task.login1();
		Task.logout();
		
		Task.login2();
		Task.logout();
		
		Task.login3();
		Task.logout();
		
	    Task.login();
		Task.modifyusrer1();
		Task.modifyusrer2();
		Task.modifyusrer3();
	    Task.logout();
	    
	    Task.login();
	    Task.delet1();
	    Task.deletuser2();
	    Task.deletuser3();
	   
	    Task.logout();*/
		

	}

}
