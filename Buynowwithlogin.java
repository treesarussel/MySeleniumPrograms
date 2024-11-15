package seleniumpackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Buynowwithlogin {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
	WebElement buynow=	driver.findElement(By.id("buy-now-button"));
	buynow.click();
	WebElement payment=driver.findElement(By.name("ppw-instrumentRowSelection"));
payment.click();
WebElement carddetails= driver.findElement(By.linkText("Enter card details"));
carddetails.click();
WebElement cardnumber= driver.findElement(By.name("addCreditCardNumber"));
cardnumber.sendKeys("4591560307902379");


}
}

