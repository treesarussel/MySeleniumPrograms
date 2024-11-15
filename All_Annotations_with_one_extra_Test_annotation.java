package selenium.packkage.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class All_Annotations_with_one_extra_Test_annotation {

	@Test
	public void test()
	{
		System.out.println("this is @test annotation");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("this is @BeforeMethod annotation");
	}
@AfterMethod
public void aftermethod()
{
	System.out.println("this is @after method");
}
@BeforeTest
public void Beforetest()
{
	System.out.println("this is @before test");
}
@AfterTest
public void Aftertest()
{
	System.out.println("this is @After test");
}
@BeforeClass
public void beforeclass()
{
	System.out.println("this is @before class");
}
@AfterClass
public void afterclass()
{
	System.out.println("this is @after class");
}
@BeforeSuite
public void beforesuit()
{
	System.out.println("this is before suite");
}
@AfterSuite
public void aftersuite()
{
	System.out.println("this is After suite");
}
@Test
public void test1()
{
	System.out.println("this is test annotation 2");
}
}
