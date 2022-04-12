package seleniumwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ProjectmodifictionTest
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
			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[2]")).click();	
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();	
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();	
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='customerLightBox_nameField']")).sendKeys("Maanasramu");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']/div/span")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		
		{
			e.printStackTrace();
		}
	}
	static void deletusrer()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='customerPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createproject()
	{
		try
		{
		obrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
		Thread.sleep(1000);
		obrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
		Thread.sleep(1000);
		//obrowser.findElement(By.xpath("//*[@id='projectPopup_projectNameField']")).sendKeys("madhura");
		//Thread.sleep(1000);
		obrowser.findElement(By.xpath("//*[@id='projectPopup_projectNameField']")).sendKeys("manchalakar");
		Thread.sleep(1000);
		obrowser.findElement(By.xpath("//*[@id='projectPopup_commitBtn']/div/span")).click();
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
	static void deletusrerproject()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='projectPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(1000);	
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
		
	}
	static void modiferproject()
	{
		try
		{
		obrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
		Thread.sleep(1000);
		obrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).sendKeys("i love java");
		Thread.sleep(1000);
		obrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}
	
		


public class Createprojectmodification {

	public static void main(String[] args) {
		ProjectmodifictionTest.show();
		ProjectmodifictionTest.navigate();
		ProjectmodifictionTest.logic();
		ProjectmodifictionTest.minimizeFlyOutWindow();
		ProjectmodifictionTest.createuser();
		ProjectmodifictionTest.createproject();
		ProjectmodifictionTest.modiferproject();
		ProjectmodifictionTest.deletusrerproject();
		ProjectmodifictionTest.deletusrer();
     	ProjectmodifictionTest.logout();
	}

}