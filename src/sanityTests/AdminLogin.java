package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminLogin {

	public static void main(String[]args) throws InterruptedException{
	
		System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver ();// Launch the Firefox Browser with blank URL
		
		driver.get("https://login.yahoo.com/m");
		//driver.manage().window().maximize();
		driver.findElement(By.id("login-signin")).click();
		String yy = driver.findElement(By.id("username-error")).getText();
		
		
		//String s = driver.findElement(By.xpath(".//*[@id='headingText']")).getText();
		
		System.out.println(yy);
		
		/*driver.get("https://in.yahoo.com/?p=us");
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.navigate().to("https://www.google.co.in/?gfe_rd=cr&ei=u7NyWbbDNovz8Aej8YuIDQ&gws_rd=ssl");
		 URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.navigate().to("https://login.salesforce.com/");
		URL = driver.getCurrentUrl();
		System.out.println(URL);*/
		
		//driver.get("https://in.yahoo.com/?p=us");
		//WebElement Email = driver.findElement(By.xpath(".//*[@id='uh-signin']"));
		//Email.sendKeys("Deb.julien2007@yahoo.in");
		Thread.sleep(5000);
		
		//Return Type of the object
		
		//Email.getAttribute("text");
		
		//Return the Value of the object
		
		//String text = Email.getText();
		//System.out.println(text);
		
		//Return the Displayed Status
		
		//System.out.println(Email.isDisplayed());
		
		//Return the isEisplayed Status
		
		//System.out.println(Email.isEnabled());
		
		
		
		
		/*String ba = driver.getCurrentUrl();
		System.out.println(ba);
		
		String ac = driver.getPageSource();
		//System.out.println(ac);
		
		String ca = driver.getWindowHandle();
		System.out.println(ca);
		String ab = driver.getTitle();
		System.out.println(ab);
		
		driver.navigate().to("https://login.salesforce.com/");
		String xy = driver.getCurrentUrl();
		System.out.println(xy);
		
		driver.navigate().back();
		String bd = driver.getCurrentUrl();
		System.out.println(bd);*/
		
		//driver.findElement(By.xpath(".//*[@id='uh-signin']")).click();
		//driver.findElement(By.id("LastName")).sendKeys("Ghosh");
		//Thread.sleep(5000);
		//driver.findElement(By.id("LastName")).clear();
		//Thread.sleep(5000);
		//driver.findElement(By.id("FirstName")).clear();
		
		//driver.findElement(By.id("GmailAddress")).sendKeys("qwesawft123@gmail.com");
		//driver.findElement(By.id("Passwd")).sendKeys("Walmart$112233");
		//driver.findElement(By.id("Passwd")).sendKeys("Walmart$112233");
		//driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("1234567890");
		//driver.findElement(By.id("createaccount")).sendKeys("deb.julien2007@gmail.com");
		
		/*driver.findElement(By.name("Username")).sendKeys("admin@wildcraft.com");
		driver.findElement(By.name("Password")).sendKeys("Walmart@23");
		driver.findElement(By.id("Login")).click();
		
		String url = driver.getCurrentUrl();
		
		  if (url.equals("http://https://login.salesforce.com/")) {
			  System.out.println("Login Successful - Passed");
		  }
		  else {
			  System.out.println("Login Unsuccessful - failed");
		  }*/
		// Thread.sleep(5000);
		driver.close();// Close the Browser
	}
}