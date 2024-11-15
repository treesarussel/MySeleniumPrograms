package selenium.packkage.testng;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Amazon_parallel {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void add_to_cart(String nameofbrowser) throws InterruptedException
	{
		if(nameofbrowser.equals("chrome"))
		{
			 driver=new ChromeDriver();
		}
		if(nameofbrowser.equals("firefox"))
		{
			 driver=new FirefoxDriver();
		}
		if(nameofbrowser.equals("edge"))
		{
			 driver=new EdgeDriver();
		}
	driver.get("https://www.amazon.in/ref=nav_logo");
	driver.manage().window().maximize();
	WebElement w1=driver.findElement(By.linkText("Sign in"));
	w1.click();
	WebElement w2=driver.findElement(By.name("email"));
	w2.sendKeys("8344829118");
	WebElement w3=driver.findElement(By.xpath("//input[@class='a-button-input']"));
	w3.click();
	WebElement w4=driver.findElement(By.name("password"));
	w4.sendKeys("Treesa@123");
	WebElement w5=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	w5.click();
WebElement search=	driver.findElement(By.id("twotabsearchtextbox"));
search.sendKeys("pen" +""+Keys.ENTER);
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
	Thread.sleep(2000);
	WebElement addtokart=driver.findElement(By.id("add-to-cart-button"));
	addtokart.click();
}
}