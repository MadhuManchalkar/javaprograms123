package seleniumwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginLogoutPOM
{
	public static WebDriver obrowser=null;	
    public static Actitimepage oPage=null;
    static void launchbrowser()
    {
   	 try
   	 {
   		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Madhu\\eclipse-workspace\\WebAutomation12\\Libararies\\Driver\\chromedriver.exe");
   		 obrowser=new ChromeDriver();
			 oPage=new  Actitimepage(obrowser); 
			 
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
    		oPage.username1().sendKeys("admin");
    	    Thread.sleep(1000);
    		oPage.password().sendKeys("manager");
    		Thread.sleep(1000);
    		oPage.loginpage().click();
			Thread.sleep(1000);
			
      	 }
      	 catch(Exception e)
      	 {
      		 e.printStackTrace();
      	 }
       }
    static void mimizeflywindow()
    {
    	try
     	 {
     	    oPage.minimization().click();;
     	   Thread.sleep(1000);
     	 }
    	catch(Exception e)
    	{
    		 e.printStackTrace();
    	}
    	
    }
    static void logout()
    {
    	try
    	{
    	  oPage.logout().click();;
    	  Thread.sleep(1000);
    	}
    	catch(Exception e)
    	{
    		 e.printStackTrace();
    	}
    }
    static void User()
    {
    	try
    	{
    		oPage.user123().click();
    		Thread.sleep(1000);
    		oPage.adduser12().click();
    		Thread.sleep(1000);
    		oPage.firstname1().sendKeys("madhu");
    		Thread.sleep(1000);
    		oPage.LastName1().sendKeys("manchalakar");
    		Thread.sleep(1000);
    		oPage.mail().sendKeys("madhu@gmail.com");
    		Thread.sleep(1000);
    		oPage.Usernameuser().sendKeys("madhumaanas");
    		Thread.sleep(1000);
    		oPage.userpassword().sendKeys("madhu123");
    		Thread.sleep(1000);
    		oPage.userretypepassword().sendKeys("madhu123");
    		Thread.sleep(1000);
    		oPage.Createuser().click();
    		Thread.sleep(1000);
    	}
    	catch(Exception e)
    	{
    		 e.printStackTrace();
    	}
    }
   
}

public class Loginlogout1 {

	public static void main(String[] args) {
		LoginLogoutPOM.launchbrowser();
		LoginLogoutPOM.navigate();
		LoginLogoutPOM.Login();
		LoginLogoutPOM.mimizeflywindow();
		LoginLogoutPOM.User();
		
		
		LoginLogoutPOM.logout();
		
	}

}
