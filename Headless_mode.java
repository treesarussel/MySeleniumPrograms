package ab45_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Headless_mode {
	
		public static void main(String[] args) {
			FirefoxOptions options= new FirefoxOptions();
			options.addArguments("--headless");
			FirefoxDriver driver= new FirefoxDriver(options);
			driver.get("https://www.amazon.in/ref=nav_logo");
			driver.manage().window().maximize();
			WebElement e1=driver.findElement(By.xpath("//a[.='About Amazon']"));
			Point p1=e1.getLocation();
			int x=p1.getX();
			int y=p1.getY();
			System.out.println(x);
			System.out.println(y);
			JavascriptExecutor js=driver;
			js.executeScript("window.scrollBy,(0,200)");
			js.executeScript("window.scrollBy,(0,"+y+")");
			e1.click();

		}
	}


