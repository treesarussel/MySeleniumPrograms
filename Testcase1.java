package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import graphql.Assert;

@Listeners(listeners.Listeners_class.class)
public class Testcase1 extends Listeners_class 
//child class
{
	
	
	@Test
	public void logintoamazon() 
	{
		driver= new ChromeDriver();
		 driver.get("https:\\www.amazon.in");
		 driver.manage().window().maximize();
		WebElement w1 = driver.findElement(By.id("nav-link-accountList"));
		
		
		 w1.sendKeys(Keys.ENTER);
		 w1.click();
		 
		 WebElement w2=driver.findElement(By.name("email"));
		 w2.sendKeys("8344829118");
		 WebElement w3=driver.findElement(By.xpath("//input[@class='a-button-input']"));
		 w3.click();
		 
		 WebElement w4 = driver.findElement(By.name("password"));
		 w4.sendKeys("Treesa@123");
		 WebElement w5=	 driver.findElement(By.id("signInSubmit"));
			w5.click();
			//Assert.assertTrue(false);
	}

}
