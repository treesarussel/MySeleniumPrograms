package selenium.packkage.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngDemo {

	@Test
	public void login()
	{
		System.out.println("login");
	}
	@BeforeMethod
	public void launch("login")
	{
		
	}
	@AfterMethod
	public void quit("quit")
	{
		
	}
}
