package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingElements {

	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		
	WebDriver driver = new FirefoxDriver();
		
	driver.get("https://www.google.co.in/?gws_rd=ssl");
	//String Title  = driver.getTitle();
	
	//Operation of Google Image
	
	System.out.println(driver.findElement(By.id("hplogo")).isDisplayed());
	System.out.println(driver.findElement(By.id("hplogo")).isEnabled());
	System.out.println(driver.findElement(By.id("hplogo")).getAttribute("title"));
	System.out.println(driver.findElement(By.id("hplogo")).getText());
	
	// Operation on Image button
	
	System.out.println(driver.findElement(By.id("gb_70")).getText());
	driver.findElement(By.xpath(".//*[@id='gb_70']")).click();
	
	//Operation On Image Link
	
	driver.navigate().to("http://www.seleniumhq.org/");
	System.out.println(driver.findElement(By.xpath(".//*[@id='choice']/tbody/tr/td[2]/center/a/img")).getText());
	driver.findElement(By.xpath(".//*[@id='choice']/tbody/tr/td[2]/center/a/img")).click();
	
	
	
	//driver.findElement(By.id("identifierId")).sendKeys("ghoshdeb786");
	//System.out.println(driver.findElement(By.id("u_0_s")).getAttribute("Log In"));
	Thread.sleep(2000);
	driver.close();
	}

}