package abcd;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//irctc website
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		System.out.println(driver.getCurrentUrl());
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//input[@id='usernameId']")).sendKeys("debo27");
		driver.findElement(By.className(".//*[@id='loginFormId']/div[1]/div[2]/table[1]/tbody/tr[2]/td[2]/input")).sendKeys("dbe292");
		
		//Taking input from user
		//Dynamic submission of Test data
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Captcha");
		String captcha = scan.nextLine();
		
		driver.findElement(By.xpath(".//*[@id='nlpAnswer']")).sendKeys(captcha);
		
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		
		String url = driver.getCurrentUrl();
		
		//Verification Point
		
		if(url.equals("https://www.irctc.co.in/eticketing/home")) {
			System.out.println("Url is " + url + "Passed");
		}
		else {
			System.out.println("Failed");
		}
	    // Signing Out
		driver.findElement(By.xpath(".//*[@id='topnav']/li[8]/ul/li[5]/a/span")).click();
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
	}

}
