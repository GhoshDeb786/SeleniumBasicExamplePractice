package sanityTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=yauwWe7nLNTy8Afhu5_oCA");
		
		String PageTitle = driver.getTitle();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		if (PageTitle.equals("Google")){
			System.out.println("Application launched - Passed");
		}
		else {
			System.out.println("Application Did Not launched - Failed");
		}
    driver.close();
	}

}