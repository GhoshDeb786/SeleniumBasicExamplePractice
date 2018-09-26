package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GCRHandlingDuplicateObject {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver ();
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin@123");
        driver.findElement(By.xpath("//button[@id='tdb1']")).click();
        
        driver.findElement(By.xpath("//a[@href='http://www.gcrit.com/build3/']")).click();
        System.out.println(driver.getCurrentUrl());
        
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        
        driver.findElement(By.xpath("//a[@href='http://www.gcrit.com/build3/admin/login.php?action=logoff']")).click();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
        
        driver.close();
	}

}