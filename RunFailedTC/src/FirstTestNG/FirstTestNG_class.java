package FirstTestNG;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.*;


public class FirstTestNG_class {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\Users\\GBadavanache\\Desktop\\geckodriver-v0.29.1-win64\\geckodriver.exe";
    public WebDriver driver; 
    public String expected = null;
    public String actual = null;
    
        @BeforeTest
      public void launchBrowser() {
          System.out.println("launching firefox browser"); 
 		 System.setProperty("webdriver.gecko.driver",driverPath);  
          driver= new FirefoxDriver();
          driver.get(baseUrl);
          System.out.print("Before Test\n");
      }
      
      @BeforeMethod
      public void verifyHomepageTitle() {
          String expectedTitle = "Welcome: Mercury Tours";
          String actualTitle = driver.getTitle();
          AssertJUnit.assertEquals(actualTitle, expectedTitle);
          System.out.print("Before Method\n");
      }
      public void registerPage(){
          driver.findElement(By.linkText("REGISTER")).click() ;
          expected = "Register: Mercury Tours";
          actual = driver.getTitle();
          AssertJUnit.assertEquals(actual, expected);
      }
      public void signinPage() {
            driver.findElement(By.linkText("SIGN-ON")).click() ;
            expected = "Sign-on: Mercury Tours";
            actual = driver.getTitle();
            AssertJUnit.assertEquals(actual, expected);
      }
          public void flightPage() {
        	  driver.findElement(By.linkText("Flights")).click();
        	  expected = "Find a Flight: Mercury Tours:]";
        	  actual = driver.getTitle();
        	  AssertJUnit.assertEquals(actual,expected);
        	  
          }
      @AfterMethod
      public void goBackToHomepage ( ) {
            driver.findElement(By.linkText("Home")).click() ;
            System.out.print("after Method\n");
      }
       
     @AfterTest
      public void terminateBrowser(){
          driver.close();
          System.out.print("After Test\n");
      }
}
