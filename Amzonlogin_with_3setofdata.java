package selenium.packkage.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Amzonlogin_with_3setofdata {
	@Test(dataProvider="login_details")
	public void testcase1(String un,String pwd)
	{ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/ref=nav_logo");
	driver.manage().window().maximize();
	WebElement w1=driver.findElement(By.linkText("Sign in"));
	w1.click();
	WebElement w2=driver.findElement(By.name("email"));
	w2.sendKeys(un);
	WebElement w3=driver.findElement(By.xpath("//input[@class='a-button-input']"));
	w3.click();
	WebElement w4=driver.findElement(By.name("password"));
	w4.sendKeys(pwd);
	WebElement w5=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	w5.click();
		
	}
	@DataProvider(name="login_details")
	public Object[][] method1()
	{
		Object[][]data=new Object[3][2];
	      data[0][0]="8113028764";
	      data[0][1]="Treesa@123";
	      data[1][0]="8344829118";
	      data[1][1]="Treesa@123";
	      data[2][0]="treesarussel@gmail.com";
	      data[2][1]="Treesa1@123";
		return data;
	      
		
	}

}
