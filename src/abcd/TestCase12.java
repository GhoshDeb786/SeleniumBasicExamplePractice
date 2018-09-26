package abcd;

import org.openqa.selenium.By;

public class TestCase12 extends UserDefined_TestCase10{

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		
		//Admin Login Functionality with invalid inputs

		//Test Case 3: Admin Login Functionality with invalid inputs(Negative Test Case)

		//Create Object/Instance
		TestCase12 obj3 = new TestCase12();
		obj3.launchBrowser();
		
		
		//Thread.sleep(3000);
		obj3.adminLogin("admina", "admin@123a");
		String ErrorMessage = driver.findElement(By.className("messageStackError")).getText();

		if (ErrorMessage.contains("Error: Invalid administrator login attempt.")){
		System.out.println("Handling Invalid Inputs - Passed"); 
		}
		else {
		System.out.println("Not Handling Invalid Inputs - Failed");
		}
		obj3.closeBrowser();

	}

}