package seleniumwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitimepage {
	
	public Actitimepage(WebDriver obrowser) {
		PageFactory.initElements(obrowser, this);
	}
	
	
	private WebElement username;
	public WebElement username1()
	{
		return username;
	}
	private WebElement pwd;
	public WebElement password()
	{
		return pwd;
	}
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement Login;
	public WebElement  loginpage()
	{
         return Login;
	}
	
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement  minimization()
	{
		return  gettingStartedShortcutsPanelId;
	}
	private WebElement logoutLink;
	public WebElement  logout()
	{
		return  logoutLink;
	}
	
	
	@FindBy(xpath="//div[text()='USERS']")
	private WebElement user123;
	public WebElement  user123()
	{
         return user123;
	}
	
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement Adduser;
	public WebElement adduser12()
	{
		return Adduser;
	}
	//create user
	private WebElement firstName;
	public WebElement firstname1()
	{
		return firstName;
	}
	private WebElement lastName;
	public WebElement LastName1()
	{
		return lastName;
	}
	private WebElement email;
	public WebElement mail()
	{
		return email;
	}
	private WebElement userDataLightBox_usernameField;
	public WebElement Usernameuser()
	{
		return userDataLightBox_usernameField;
	}
	private WebElement userDataLightBox_passwordField;
	public WebElement userpassword()
	{
		return  userDataLightBox_passwordField;
	} 
	private WebElement passwordCopy;
	public WebElement userretypepassword()
	{
		return  passwordCopy;
	} 
	
	
	@FindBy(xpath="//span[text()='Create User']")
	private WebElement Createuser;
	public WebElement Createuser()
	{
		return Createuser;
	}
	@FindBy(xpath="//span[text()='manchalakar, madhu']")
	private WebElement deleteuser;
	public WebElement deleteuser()
	{
		return deleteuser;
	}
	private WebElement userDataLightBox_deleteBtn;
	public WebElement deletbutton()
	{
		return userDataLightBox_deleteBtn;
	}
	@FindBy(xpath="//span[text()='manchalakar, madhu']")
	private WebElement modification ;
	public WebElement modification1()
	{
		return modification;
	}
	
	@FindBy(xpath="//span[text()='Save Changes']")
	private WebElement save ;
	public WebElement save()
	{
		return save;
	}
	
	
}
