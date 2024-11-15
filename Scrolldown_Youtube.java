package ab45_assignments;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown_Youtube {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebElement search=driver.findElement(By.id("search"));
	
	search.sendKeys("India");
	
	//Thread.sleep(4000);
	search.sendKeys(Keys.ENTER);
	}
}
