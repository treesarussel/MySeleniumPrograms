package selenium.packkage.testng;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority=2)
	public void p1()
	{
		System.out.println("priority 2");
	}
	@Test(priority=-1)
	public void p2()
	{
		System.out.println("priority -1");
	}
	@Test(priority=1)
	public void p3()
	{
		System.out.println("priority 1");
	}
}
