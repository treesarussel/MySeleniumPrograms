package from24thsepclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Css_Selector {
	WebDriver driver;
@Test
public void fblogin()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.cssSelector("#email"));
	e1.sendKeys("8344829118");
	WebElement e2=driver.findElement(By.cssSelector("#pass"));
	e2.sendKeys("Treesa@12345");
	WebElement e3=driver.findElement(By.xpath("//button[@name='login']"));
	e3.click();
}
}
