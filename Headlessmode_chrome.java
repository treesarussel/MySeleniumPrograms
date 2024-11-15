package ab45_assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Headlessmode_chrome {
	public static void main(String[] args) {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--headless");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//write any program here
		// it will run headless mode

}
