package selenium.packkage.testng;

import org.testng.annotations.Test;

public class Priorityagain {
	@Test(priority=1)
	public void login()
	{
		System.out.println("login");
	}
	@Test(priority=1)
	public void logout()
	{
		System.out.println("login");
	}
	@Test(priority=-1)
	public void register()
	{
		System.out.println("login");
	}

}
