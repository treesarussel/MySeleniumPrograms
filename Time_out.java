package selenium.packkage.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Time_out {
@Test(timeOut=8000)
public void login()
{
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
driver.manage().window().maximize();
 WebElement Gmail=driver.findElement(By.linkText("Gmail"));
 Gmail.click();
}
}
