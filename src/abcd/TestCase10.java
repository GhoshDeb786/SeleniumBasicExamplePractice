package abcd;

import org.openqa.selenium.By;

//Test Case : Redirect to User Interface from Admin Interface

public class TestCase10 extends UserDefined_TestCase10{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		
		TestCase10 obj = new TestCase10();
		obj.launchBrowser();
		obj.adminLogin("admin", "admin@123"); //Chosen arguments as to perform +ive/-ive Testing 
		
		driver.findElement(By.linkText("Online Catalog")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if (url.equals("http://www.gcrit.com/build3/")) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
				obj.closeBrowser();
		
	}

}
