package sanityTests;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\INFOCOM\\Downloads\\IEDriverServer_Win32_3.8.0\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
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