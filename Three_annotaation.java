//"There is a class with 3 @ Test annotations.
//1 @BS, 1 @AS and 1 @ AM. What is the order of execution.
//Write a program for the above scenario to understand the order of execution"
package selenium.packkage.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Three_annotaation {
@Test
public void Test_1()
{
	System.out.println("This is test one");
}
@Test
public void Test_2()
{
	System.out.println("This is test two");
	}
@Test
public void Test_3()
{
	System.out.println("This is test three");
	}
@BeforeSuite
public void launch()
{
	System.out.println("This is before suite");
}
@AfterSuite
public void close()
{
	System.out.println("This is after suite");
	}

@AfterMethod

	public void End()
	{
		System.out.println("This is after method");
		}


}





