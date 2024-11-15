//Write a program to demonstrate that a test case 
//can be run multiple times using
//the invocationCount parameter
package selenium.packkage.testng;

import org.testng.annotations.Test;

public class Invocation_Count {

	@Test(invocationCount=10)
	public void testcase_1()
	{
		System.out.println("this is test case 1");
	}
	
}


