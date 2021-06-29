package ParallelExecution;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.testng.annotations.Test;

public class ParallelExecution {
    @Test    
    public void executSessionOne(){
            //First session of WebDriver
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\GBadavanache\\Desktop\\geckodriver-v0.29.1-win64\\geckodriver.exe");  
        WebDriver driver = new FirefoxDriver();
            //Goto guru99 site
            driver.get("http://demo.guru99.com/V4/");
            //find user name text box and fill it
            WebElement rightClickElement = driver.findElement(By.name("uid")); //right click 
            Actions action = new Actions(driver);
            action.contextClick(rightClickElement).build().perform();
            rightClickElement.sendKeys("Driver 1");
                    
        }
        
    @Test    
    public void amazonsession() {
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\GBadavanache\\Desktop\\geckodriver-v0.29.1-win64\\geckodriver.exe");  
        WebDriver driver = new FirefoxDriver();            //Goto guru99 site
	    driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	    WebElement UN =  driver.findElement(By.id("ap_email"));
	    Actions action = new Actions(driver);
	    action.moveToElement(UN).perform(); //mouse hover
	   UN.sendKeys("7406821194");
	      driver.findElement(By.id("continue")).click();
	       driver.findElement(By.id("ap_password")).sendKeys("Gayatri@123");
	       driver.findElement(By.id("signInSubmit")).click();
        
        }
        
    @Test    
        public void executSessionThree() throws InterruptedException{
            //Third session of WebDriver
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\GBadavanache\\Desktop\\geckodriver-v0.29.1-win64\\geckodriver.exe");  
        WebDriver driver = new FirefoxDriver();            //Goto guru99 site
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.name("cusid")).sendKeys("45678");
        driver.findElement(By.cssSelector("input[value=\"Submit\"]")).submit();
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
       String AlertMessage = driver.switchTo().alert().getText();
        System.out.println("print the alert msg:" +AlertMessage);
        alert.accept();	
        
        }        
}
