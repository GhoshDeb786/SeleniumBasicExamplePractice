package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2 {

	public static void main(String[] args) {
		
		boolean result = true;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
 
		Boolean status = driver.findElement(By.linkText("Gmail")).isDisplayed();//isEnabled() will also work
		//System.out.println(status);
		try {	
			
		if(result == status){
			System.out.println("Gmail link exists - Passed");
		}
 }
		catch (NoSuchElementException e) {
			System.out.println("Gmail link does not exists - Failed ");
		}
	
		driver.quit();
	}

}