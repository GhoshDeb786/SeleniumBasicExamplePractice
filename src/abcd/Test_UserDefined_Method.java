package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_UserDefined_Method {

	//Launch the Browser
	
	public static WebDriver driver;
	
	public void launchBrowser1() {
		driver = new FirefoxDriver();
	}
	
	//Admin Login without Parameters
	
	public void adminLogin1() {
		
		driver.get("http://www.gcrit.com/build3/admin/login.php?osCAdminID=m3ghvh9qvog8dik529u5gdbp43");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).submit();	
	}
	
	//Admin Login With Parameters - Method Overloading
	
	public void adminLogin1(String username, String password){
		
		driver.get("http://www.gcrit.com/build3/admin/login.php?osCAdminID=m3ghvh9qvog8dik529u5gdbp43");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("tdb1")).submit();	
	}
	
	//Close Browser
	
	public void closeBrowser(){
	if (! driver.toString().contains("null")){
	driver.close();
	}
	}
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		
		Test_UserDefined_Method obj1 = new Test_UserDefined_Method();
		
		obj1.launchBrowser1();
		obj1.adminLogin1();
		obj1.adminLogin1("admina","admina123");
		obj1.closeBrowser();
		
	}

}