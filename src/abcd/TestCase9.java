package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestCase9 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");

		
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.facebook.com/");
		Thread.sleep(2000);
		String message = driver1.findElement(By.xpath(".//*[@id='content']/div/div/div/div/div[2]/div[1]/div[1]/span")).getText();
		System.out.println(message);
		Thread.sleep(3000);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\de543804\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver2 = new ChromeDriver();
		driver2.get("http://www.gcrit.com/build3/create_account.php?osCsid=88fvo90uli1foq2s6p9i91jd82");
		driver2.findElement(By.name("firstname")).sendKeys(message);
		Thread.sleep(3000);
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\de543804\\Downloads\\IEDriverServer_x64_3.5.1\\IEDriverServer.exe");
		WebDriver driver3 = new InternetExplorerDriver();
		driver3.get("https://in.mail.yahoo.com/");
		
		driver1.close();
		
		driver2.close();
		
		driver3.close();
			
	}

}