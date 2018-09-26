package sanityTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrossBrowserTesting {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INFOCOM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
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