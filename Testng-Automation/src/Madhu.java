import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Madhu {
	@Test
	public void disply()
	{
		System.out.println("madhu");
	}
	@BeforeTest
	public void show()
	{
		System.out.println("megha");
	}
	@AfterTest
	public void show1()
	{
		System.out.println("manasa");
	}
	

	
}
