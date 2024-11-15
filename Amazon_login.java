package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_login {

	public static void main(String[] args) throws InterruptedException {
	//Launch the Amazon direct click on the Sign in button and using name Locator add UserName, Continue and Password 
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https:\\www.amazon.in");
		 driver.manage().window().maximize();
		WebElement w1 = driver.findElement(By.id("nav-link-accountList"));
		Thread.sleep(3000);
		 w1.sendKeys(Keys.ENTER);
		 w1.click();
		 Thread.sleep(3000);
		 WebElement w2=driver.findElement(By.name("email"));
		 w2.sendKeys("8344829118");
		 WebElement w3=driver.findElement(By.xpath("//input[@class='a-button-input']"));
		 w3.click();
		 Thread.sleep(3000);
		 WebElement w4 = driver.findElement(By.name("password"));
		 w4.sendKeys("Treesa@123");
		 WebElement w5=	 driver.findElement(By.id("signInSubmit"));
			w5.click();
		 
		}
		
		
		
	}


