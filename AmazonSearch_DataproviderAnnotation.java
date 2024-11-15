package selenium.packkage.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AmazonSearch_DataproviderAnnotation {
	//WebDriver driver;
	@DataProvider(name="names")
	public Object[][] method1()
	{
		return new Object[][] {{"books"},{"nail clippers"},{"laptops"},{"headphones"},{"speakers"}};
	}
	
	@Test(dataProvider="names")
	public void Amazon_multiplesearch_with_dataprovider(String input)
	{
		ChromeDriver driver=new ChromeDriver();
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
	search.sendKeys(input +""+Keys.ENTER);
	
	}
}
