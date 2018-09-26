package sanityTests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWindows {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();
	
	//WindowHandle
	
	driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
	String s = driver.getWindowHandle();
	System.out.println(s);
	
	//WindowHandles
	
	driver.findElement(By.xpath("//button[@id='button1']")).click();
	Set<String> a = driver.getWindowHandles();
	System.out.println(a);
	
	//Browsers Count
	
	int BrowsersCount = a.size();
    System.out.println(BrowsersCount);
	
    //Comparing Browsers
      for(String s1 :a) {
    	  if(!s1.equals(s)){
    		  driver.switchTo().window(s1);
    		  System.out.println(driver.getCurrentUrl());
    	  }
      }
	driver.switchTo().window(s);
	System.out.println(driver.getCurrentUrl());
	
    // Closing the Parent & Child Window
	
    driver.close();
	driver.quit();
	
	}
	
}
