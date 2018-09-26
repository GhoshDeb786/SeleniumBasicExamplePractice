package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase8 {

	static int i;
	static String username, password, iteration;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");
        
		WebDriver driver = new FirefoxDriver();
		
		//Loop for 2 iteration(Negetive & Positive)- Not using any Test Data file
		
		for(i = 1; i <= 2; i++){
			
			if (i==1) {
				username = "admin";
				password = "admin@123";
				iteration = "Iteration 1";
				}
			else if (i ==2){
				username = "admin1";
				password = "admin@1234";
				iteration = "Iteration 2";
			}
			
			//Entering Details & Submission 
			Thread.sleep(4000);
			
		driver.get("http://www.gcrit.com/build3/admin/login.php?osCAdminID=ac4ke8bhr7f009765vn374i6s5");
		driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.id("tdb1")).submit();
        
        Thread.sleep(3000);
        
        String url = driver.getCurrentUrl();
        
        if (url.contains("http://www.gcrit.com/build3/admin/index.php")) {
          System.out.println(iteration + (" Input Data : ") + username + " " + password + " Admin Login Successful - Passed");
          Thread.sleep(2000);
          driver.findElement(By.xpath("//a[@class='headerLink']")).click();
        }
        else if (!url.contains("http://www.gcrit.com/build3/admin/index.php")) {
        	Thread.sleep(2000);
        	String ErrorMessage = driver.findElement(By.className("messageStackError")).getText();
        	System.out.println(ErrorMessage);
        	
        	Thread.sleep(2000);
        	if (ErrorMessage.contains("Invalid Adminitrator Login Attempt.")) {
        		System.out.println(iteration + (" Input Data : ") + username + " " + password + " Handling Invalid Inputs - Passed");
        	}
        	else {
        		System.out.println(iteration + " - Failed");
               	      	
         } // Closure of Else
       } // Closure of Else if
	} // Closure of For Loop
		
       driver.close();
	} // Closure of main method
} // Closure of class - TestCase8