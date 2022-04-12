package pom_work;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actime_page11 {
	Actime_page11(WebDriver obroswer)
	 {
		PageFactory.initElements(obroswer,this);
	 }
	private WebElement username;
	public WebElement Useraname()
	 {
		return username;
	 }
	private WebElement pwd;
	public WebElement password()
	 {
		return  pwd;
   	 }
	@FindBy(xpath="//*[@id='loginButton']/div")
	private WebElement Loginpage;
	public WebElement Loginpage()
	 {
		return Loginpage;
	 }
	
}


