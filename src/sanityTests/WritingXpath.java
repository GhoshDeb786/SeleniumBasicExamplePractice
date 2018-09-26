package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WritingXpath {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver ();
		
		driver.get("https://www.carmax.com/");
		driver.findElement(By.xpath("//a[contains(@href,'/research')]")).click();
		System.out.println(driver.findElement(By.xpath("//a[contains(@href,'/research')]")).getAttribute("title"));
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@href='/cars']")).click();
		System.out.println(driver.findElement(By.xpath("//a[@href='/cars']")).getAttribute("title"));
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		
		/*driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
		driver.findElement(By.xpath("//input[@name='usernameOrEmail' and @type='text']")).sendKeys("ghoshdeb786@gmail.com");
		driver.findElement(By.xpath(".//*[@type='submit']")).click();*/
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}