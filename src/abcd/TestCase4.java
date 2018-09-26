package abcd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://gcrit.com/build3/");
        System.out.println(driver.getCurrentUrl());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.linkText("create an account")).click();
        System.out.println(driver.getCurrentUrl());
        
        //Filling the form
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).click();
        driver.findElement(By.name("firstname")).sendKeys("Deb");
        driver.findElement(By.name("lastname")).sendKeys("Ghosh");
        
        driver.findElement(By.className("hasDatepicker")).sendKeys("05/21/2017");
        driver.findElement(By.name("email_address")).sendKeys("papa8@gmail.com");
        driver.findElement(By.name("street_address")).sendKeys("Neeladri Nagar, 13th Cross");
        driver.findElement(By.name("postcode")).sendKeys("560100");
        driver.findElement(By.name("city")).sendKeys("Bangalore");
        driver.findElement(By.name("state")).sendKeys("Karnataka");
        
        // Selecting Dropdown value
        
        Select select = new Select(driver.findElement(By.name("country")));
        select.selectByVisibleText("India");
        
        driver.findElement(By.name("telephone")).sendKeys("8017645432");
        driver.findElement(By.name("password")).sendKeys("abcd123");
        driver.findElement(By.name("confirmation")).sendKeys("abcd123");
        driver.findElement(By.id("tdb4")).submit();
        System.out.println(driver.getCurrentUrl());
        String result = driver.findElement(By.xpath(".//*[@id='bodyContent']/div/div[1]")).getText();
       
        System.out.println(result);
        
        System.out.println(driver.getCurrentUrl());
        
        //verification Point
        
        if(result.contains("Congratulations! Your new account has been successfully created!")){
        	System.out.println("Test Case Passed");
        }
        else {
        	System.out.println("Test Case Failed");
        }
        
        driver.close();
        
	}

}