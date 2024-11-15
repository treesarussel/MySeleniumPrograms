//"Assignment7
//WAP launch Amazon.in and click on Customer service with help of  PartialLinkText locator"
package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_customerservice_partiallinktext_locator {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.in/ref=nav_logo");
		 driver.manage().window().maximize();
		 WebElement Customer_service=driver.findElement(By.partialLinkText("Customer"));
		 Customer_service.click();
		 

	}

}
