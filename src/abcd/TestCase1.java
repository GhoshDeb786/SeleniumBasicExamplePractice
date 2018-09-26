package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		
     WebDriver driver = new FirefoxDriver();
     
     // Navigating to selenium wikipedia page
     driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
     
     //clicking on Create account hyperlink
     driver.findElement(By.linkText("Create account")).click();
     String url = driver.getCurrentUrl();
     
     //printing the current url
     System.out.println(url);
     
     //Verification point - comparing the url - Actual with Expected 
     
     if (url.contains("wikipedia.org")){
    	 System.out.println("Passed");
     }
     else {
    	 System.out.println("Failed");
     }
     driver.navigate().back();
     driver.findElement(By.linkText("www.seleniumhq.org")).click();
     url = driver.getCurrentUrl();
     System.out.println(url);
     
     if (url.contains("seleniumhq")){
    	 System.out.println("Passed");
     }
     else {
    	 System.out.println("Failed");
    	 
     }
         driver.navigate().to("https://www.google.co.in/");
         driver.quit();
	}

}