package sanityTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AllCrossBrowserTesting {

	//public  static WebDriver driver;
	//public static int browser;
	//public static String BrowserName;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		
		//Here we have declared local variables , initialised to default
		 WebDriver driver = null;
		 int browser = 0;
		 String BrowserName = null;
		
		for(browser =1; browser <=3; browser++) {
			
			if(browser == 1){
				
				driver = new FirefoxDriver();
				BrowserName = "Mozilla Firefox Browser";
			}
			
			else if (browser == 2){
				
				System.setProperty("webdriver.chrome.driver","C:\\Users\\de543804\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				driver = new ChromeDriver();
				BrowserName = "Chrome Browser";
				Thread.sleep(5000);
			}
			
			else if (browser == 3){
				
				System.setProperty("webdriver.ie.driver","C:\\Users\\de543804\\Downloads\\IEDriverServer_x64_3.5.1\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				BrowserName = "Internet Explorer Browser";
				
			}
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=9S2xWd3HNIPy8AfYhbtA&gws_rd=ssl");
		    String PageTitle = driver.getTitle();
		    System.out.println("PageTitle : " + PageTitle);
		
		if (PageTitle.equals("Google")){
			Thread.sleep(5000);
			System.out.println(BrowserName + "Application launched - Passed");
		}
		else {
			System.out.println(BrowserName + "Application Did Not launched - Failed");
		}
    driver.close();
		}
		
	}
	
}

	
