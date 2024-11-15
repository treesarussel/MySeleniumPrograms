//Write a practical program to launch the Amazon website, 
//search for a product and add the product to the cart and 
//close the browser. Use annotations
package selenium.packkage.testng;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practicalexample_with_annotations {
	
	ChromeDriver driver = new ChromeDriver();
	String childid;
	String parentid;
	
	
	
	@BeforeMethod
	public void login() throws InterruptedException
	{
		//ChromeDriver driver = new ChromeDriver();
		 driver.get("https:\\www.amazon.in");
		 driver.manage().window().maximize();
		WebElement w1 = driver.findElement(By.id("nav-link-accountList"));
		Thread.sleep(3000);
		 w1.sendKeys(Keys.ENTER);
		 w1.click();
		 Thread.sleep(3000);
		 WebElement w2 = driver.findElement(By.id("ap_email_login"));
		 w2.sendKeys("8344829118");
		 WebElement w3 = driver.findElement(By.className("a-button-input"));
		 w3.click();
		 Thread.sleep(3000);
		 WebElement w4 = driver.findElement(By.id("ap_password"));
		 w4.sendKeys("Treesa@123");
	WebElement w5=	 driver.findElement(By.id("signInSubmit"));
	w5.click();
		 
	}
	@Test
	public void search()
	{
		WebElement search=driver.findElement(By.xpath("(//input)[5]"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
		WebElement e1=	driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		e1.click();
		Set<String> s1=	driver.getWindowHandles();
			System.out.println(s1);
			Iterator<String> i1=s1.iterator();
			String parentid=i1.next();//parent winodw id
			String childid=	i1.next();//any child id
			System.out.println(parentid);
			System.out.println(childid);
			driver.switchTo().window(childid);
			WebElement add=driver.findElement(By.name("submit.add-to-cart"));
			add.click();
	}
@AfterMethod
public void addtokart()
{
	
	driver.quit();
}
			
	}


