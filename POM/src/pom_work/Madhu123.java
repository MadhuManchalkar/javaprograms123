package pom_work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Madhu123 {
	Madhu123(WebDriver obrowser)
	{
		PageFactory.initElements(obrowser, this);
	}
	private WebElement username;
	public WebElement User_name()
	{
		return  username;
	}
	private WebElement pwd;
	public WebElement password()
	{
		return pwd;
	}
	@FindBy(xpath="//*[@id='loginButton']/div")
	private WebElement login;
	public  WebElement Login_page()
	{
		return login;
	}


}
	
	
	
	
	
	

