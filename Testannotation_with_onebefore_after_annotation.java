package selenium.packkage.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testannotation_with_onebefore_after_annotation {
@Test
public void login()
{
	System.out.println("this is login page");
}
@AfterMethod
public void logout()
{
	System.out.println("logout");
}

@BeforeMethod
public void launch_browser()
{
	System.out.println("launch browser");
}
}
