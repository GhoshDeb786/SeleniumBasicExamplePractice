package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingInlineElements {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='https://www.google.co.in/intl/en/options/']")).click();
		//driver.findElement(By.xpath(".//*[@id='gb192']/span[1]")).click();
		//String s = driver.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a")).getAttribute("title");
		//System.out.println(s);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.close();
	}

}