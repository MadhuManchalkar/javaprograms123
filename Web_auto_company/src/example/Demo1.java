package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Sample
{
	static WebDriver obrwoser=null;
	static void display()
	{
		try
		{
		System.setProperty("webdriver.chrome.driver","E:\\Demoworkspace\\Web_auto_company\\Library\\Driver\\chromedriver.exe");	
		obrwoser=new ChromeDriver();
		Thread.sleep(1000);
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
			obrwoser.get("https://www.google.com/search?q=AJIO+application&oq=AJIO+application&aqs=chrome..69i57.6162j0j7&sourceid=chrome&ie=UTF-8");
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate1()
	{
		try
		{
			obrwoser.findElement(By.xpath("//*[@id='tads']/div/div/div/div[1]/a/div[1]/span")).click();
			obrwoser.findElement(By.xpath("//*[@id='appContainer']/div[1]/div/header/div[3]/div[2]/form/div/div/input")).click();
			obrwoser.findElement(By.xpath("//*[@id='react-autowhatever-1']/div/ul/li[3]/a/span")).click();
			Thread.sleep(1000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

public class Demo1 {

	public static void main(String[] args) {
		Sample.display();
		Sample.navigate();
		Sample.navigate1();
		

	}

}
