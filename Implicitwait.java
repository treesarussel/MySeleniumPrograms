package selenium.packkage.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Implicitwait {
	@Test
	public void Google_Search()
	{
		
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://google.com");
	driver.manage().window().maximize();
	driver.findElement(By.name("q")).sendKeys("India"+""+Keys.ENTER);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

}
