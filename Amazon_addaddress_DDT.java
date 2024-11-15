package seleniumpackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_addaddress_DDT {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileInputStream f1=new FileInputStream("C:\\Users\\trees\\eclipse_workspaceselenium\\Selenium\\ExcelSheet\\amazonaddaddress.xlsx");
		Workbook w1=	WorkbookFactory.create(f1);
		Sheet s1=	w1.getSheet("address");
		Row r1=	s1.getRow(0);
		Cell c1=	r1.getCell(0);
		String adrs=c1.getStringCellValue();
		System.out.println(adrs);
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("nav-link-accountList"));
		Thread.sleep(2000);
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		WebElement e2=driver.findElement(By.linkText("Sign in"));
		e2.click();
		WebElement e3=driver.findElement(By.id("ap_email"));
		e3.sendKeys("8344829118");
		WebElement e4=driver.findElement(By.xpath("//span[@id=\"continue\"][1]"));
		e4.click();
		WebElement e5=driver.findElement(By.id("ap_password"));
		e5.sendKeys("Treesa@123" +""+Keys.ENTER);
		WebElement e6=driver.findElement(By.id("nav-link-accountList"));
		Actions a2=new Actions(driver);
		a2.moveToElement(e6).perform();
		WebElement e7=	driver.findElement(By.linkText("Your Account"));
		e7.click();
		WebElement e8=	driver.findElement(By.linkText("Edit addresses for orders and gifts"));
		e8.click();
		  
		//WebElement e9=	driver.findElement(By.linkText("Edit"));
		//e9.click();
		
		//WebElement e10=	driver.findElement(By.linkText("Add address"));
		//e10.click();
		
		
	}

}
