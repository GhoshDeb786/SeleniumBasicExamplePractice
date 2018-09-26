package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserDefined_TestCase10 {

	//Launch Browser
	public static WebDriver driver;
	public void launchBrowser(){
	driver = new FirefoxDriver();
	}
	//Admin Login without Parameters
	        public void adminLogin() {
			driver.get("http://www.gcrit.com/build3/admin/login.php?osCAdminID=m3ghvh9qvog8dik529u5gdbp43");
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("password")).sendKeys("admin@123");
			driver.findElement(By.id("tdb1")).submit();	
		}
		//Admin Login With Parameters - Method Overloading
		public void adminLogin(String username, String password) {
			
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("tdb1")).click();
	}
		//Close Browser
		public void closeBrowser(){
		if (! driver.toString().contains("null")){
		driver.close();
		}
	}
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		
		UserDefined_TestCase10 obj = new UserDefined_TestCase10();
		
		obj.launchBrowser();
		obj.adminLogin();
		obj.closeBrowser();
		//With Parameters - Method Overloading
		obj.launchBrowser();
		obj.adminLogin("admin", "admin@123");
		obj.closeBrowser();
		}
		
	}
