package FirstTestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SimpleFB_DD {

	// this will take data from dataProvider which we created
	@Test(dataProvider="FBdata")
	public void TestFireFox(String Username,String Password){
			 
			// Open browser
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\GBadavanache\\Desktop\\geckodriver-v0.29.1-win64\\geckodriver.exe");  

			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://www.facebook.com");
			// clear email field
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(Username);
			 
			// Clear password field
			driver.findElement(By.id("pass")).clear();
			driver.findElement(By.id("pass")).sendKeys(Password);
			}
			 
	// this is DataProvider which actually feed data to our test cases here I have taken 2 D //array with 2 rows and 2 column it means. It will run our test case two times because we //have taken 2 rows. While first iteration this will pass username and password to test //case and in second iteration perform the same for second rows
	@DataProvider(name="FBdata")
	public Object[][] FBDataFeed(){
	 // Create object array with 2 rows and 2 column- first parameter is row and second is //column
			Object [][] facebookdata = new Object[2][2];
			facebookdata[0][0]="Selenium1@gmail.com"; // Enter data to row 0 column 0
			facebookdata[0][1]="Password1"; // Enter data to row 0 column 1
			
			facebookdata[1][0]="Selenium2@gmail.com"; // Enter data to row 1 column 0
			facebookdata[1][1]="Password2"; // Enter data to row 1 column 0
			
			return facebookdata; //return arrayobject to testscript
			}
	 
}

