//Write a program where the class has one @ test and 1 @BM and 1 @AM
package selenium.packkage.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class One_test_onebm_oneam{
	@Test
	public void Login()
	{
		System.out.println("this is login page-@test");
	}
	@BeforeMethod
	public void Launch_Browser()
	{
		System.out.println("launch-@bm");
	}
	@AfterMethod
	public void Quit_Browser()
	{
		System.out.println("Quit-@am");
	}

}
