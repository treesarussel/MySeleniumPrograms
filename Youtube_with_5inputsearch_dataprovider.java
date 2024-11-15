package selenium.packkage.testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Youtube_with_5inputsearch_dataprovider {
	WebDriver driver;
	@DataProvider(name="names")
	public Object[][]method1()
	{
		return new Object[][] {{"Grotechminds"},{"Motivational videos"},{"Software testing by mkt"},{"Code io"},{"AI"}};
	}
	@Test(dataProvider="names")
	public void youtubesearch(String inputs)
	{
	       driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement searchbar=driver.findElement(By.name("search_query"));
		searchbar.sendKeys(inputs);
	}

}
