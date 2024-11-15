package from24thsepclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Google_Rightclick_select_options 
{
	@Test
	public void rightclick_incognito() throws AWTException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.linkText("Gmail"));
		//do right click on gmail
		Actions a1=new Actions(driver);
		a1.contextClick(e1).perform();
		//select 3rd option
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_ENTER);
		
	}

}
