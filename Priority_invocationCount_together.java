package selenium.packkage.testng;

import org.testng.annotations.Test;

public class Priority_invocationCount_together {
	@Test(priority=1,invocationCount=2,enabled=false)
	public void test_1()
	{
		System.out.println("test1");
	}
	@Test(priority=2,invocationCount=1)
	public void test_2()
	{
		System.out.println("test2");
	}

}
