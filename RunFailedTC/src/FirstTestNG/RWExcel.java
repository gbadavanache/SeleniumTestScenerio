package FirstTestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RWExcel {
	
	WebDriver driver;
    WebDriverWait wait;
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFCell cell;
	
	@BeforeTest 
	public void TestSetUp() {
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\GBadavanache\\Desktop\\geckodriver-v0.29.1-win64\\geckodriver.exe"); 
	        WebDriver driver = new FirefoxDriver();
	        driver.get("https://www.linkedin.com/");
	        driver.manage().window().maximize(); 
	         //   wait = new WebDriverWait(driver,30);
	           // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void ReadData() throws IOException{
		File src = new File("C:\\Users\\GBadavanache\\Desktop\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		 workbook = new XSSFWorkbook(fis);
	      sheet = workbook.getSheetAt(0);
		
	    	  for(int i=0; i<=sheet.getLastRowNum(); i++)
	      {
	          // Import data for Email.
	          cell = sheet.getRow(i).getCell(1);
	          cell.setCellType(CellType.STRING);
	          driver.findElement(By.id("login-email")).sendKeys(cell.getStringCellValue());
	           
	          // Import data for password.
	          cell = sheet.getRow(i).getCell(2);
	          cell.setCellType(CellType.STRING);
	          driver.findElement(By.id("login-password")).sendKeys(cell.getStringCellValue());
	                  
	         }
	}
}