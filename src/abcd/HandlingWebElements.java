package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWebElements {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.co.in/?gws_rd=ssl");
	//driver.findElement(By.tagName("a")).click();
	//driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
	//driver.findElement(By.cssSelector(".gb_P")).click();
	//driver.findElement(By.className(".gb_P")).click();
	//driver.findElement(By.linkText("Gmail")).click();
	driver.findElement(By.partialLinkText("mai")).click();
	
	Thread.sleep(3000);
	driver.close();

	}

}