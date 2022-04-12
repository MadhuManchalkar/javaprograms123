package pom_work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Acti_time_login_logout {
	Acti_time_login_logout(WebDriver obroser)
	{
		PageFactory.initElements(obroser,this);
	}
	private WebElement username;
	public WebElement User_name()
	{
		return username;
	}
	private WebElement pwd;
	public WebElement pass_word()
	{
		return pwd;
	}
  @FindBy(xpath="//*[@id='loginButton']/div")
  private WebElement login;
  public WebElement logic_page()
  {
	  return login;
  }

	

}
