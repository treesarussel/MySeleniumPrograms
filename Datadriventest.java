package seleniumpackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datadriventest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream f1=new FileInputStream("C:\\Users\\trees\\eclipse_workspaceselenium\\Selenium\\testdata.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		String username=w1.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		String password=w1.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		System.out.println(username);
		System.out.println(password);
		String un=NumberToTextConverter.toText(w1.getSheet("login").getRow(1).getCell(0).getNumericCellValue());
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.name("email")).sendKeys(username);
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.name("login")).click();
		
	}

}
