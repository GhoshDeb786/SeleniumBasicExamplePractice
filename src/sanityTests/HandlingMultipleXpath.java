package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingMultipleXpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.infibeam.com/Login.action?redirectURL=https%3A%2F%2Fwww.infibeam.com%2FLogin.action%3FredirectURL%3Dhttps%253A%252F%252Fwww.infibeam.com%252F%253Futm_source%253Dgoogle%2526utm_medium%253Dadwords_cpc%2526utm_campaign%253Dbranding%2526trackId%253Dadwords%2526gclid%253DCj0KCQjwn6DMBRC0ARIsAHZtCePmki4VbimASMEe_GLDhCGi-m8SrHkSC0VJ2Oc8JWR577Fp4tydzTgaAuF4EALw_wcB");
		driver.findElement(By.xpath("//input[@name='userHandle']")).sendKeys("Almighty");
		driver.findElement(By.xpath(".//*[@id='userHandle']//following::input[@name='password']")).sendKeys("papa");
		
		driver.findElement(By.xpath("//button[@class='btn btn-register']")).click();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Deb");
		driver.findElement(By.xpath(".//*[@id='registration-form']/div[2]/div/input")).sendKeys("ghoshdeb");
		driver.findElement(By.xpath(".//*[@id='registration-form']/div[2]/div/input//following::input[@class='form-control']")).sendKeys("123");
		
		
		Thread.sleep(2000);
		driver.close();
	}

}