package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingDynamicXpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		driver.findElement(By.xpath(".//*[@id='menu2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='main']/div[7]/ul/li[3]/a")).click();
		String text = driver.findElement(By.xpath(".//*[@id='main']/div[7]/ul/li[3]/a")).getAttribute("innerHTML");
		System.out.println(text);
		System.out.println(driver.findElement(By.xpath(".//*[@id='main']/div[7]/ul/li[2]/a")).getAttribute("innerHTML"));
		Thread.sleep(2000);
		
		driver.close();
		
		

	}

}