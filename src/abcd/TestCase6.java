package abcd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase6 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.gcrit.com/build3/admin/login.php?osCAdminID=ac4ke8bhr7f009765vn374i6s5");
        
       // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin@123");
        driver.findElement(By.id("tdb1")).submit();
        
        Thread.sleep(3000);
        String url = driver.getCurrentUrl();
        System.out.println(url);
        
        //String code = driver.findElement(By.className("headerBarContent")).getText();
        //System.out.println(code);
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@class='headerLink']")).click();
        Thread.sleep(2000);
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        
        //Verification Point 
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        if (currentUrl.contains("http://www.gcrit.com/build3/admin/index.php")) {
        	System.out.println("Test Case Passed");
        }
        else {
        	System.out.println("Test case Failed");
        }
        driver.close();
         
	}

}