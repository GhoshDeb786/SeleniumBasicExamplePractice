package abcd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase7 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.gcrit.com/build3/admin/login.php?osCAdminID=ac4ke8bhr7f009765vn374i6s5");
        
       // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.id("tdb1")).submit();
        
        Thread.sleep(3000);
        
        String ErrorMessage = driver.findElement(By.className("messageStackError")).getText();
        System.out.println(ErrorMessage);
        
        //Verification Point 
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        Thread.sleep(3000);
        
        if (ErrorMessage.equals("Error: Invalid administrator login attempt")) {
        	System.out.println("Test Case Passed");
        }
        else {
        	System.out.println("Test case Failed");
        }
        driver.close();
         
	}

}