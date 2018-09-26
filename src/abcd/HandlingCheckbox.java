package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingCheckbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ironspider.ca/forms/checkradio.htm");
		
		WebElement checkBox1 = driver.findElement(By.xpath(".//*[@id='Content']/div[1]/blockquote[1]/form/input[1]"));
		WebElement checkBox2 = driver.findElement(By.xpath(".//*[@id='Content']/div[1]/blockquote[1]/form/input[2]"));
		WebElement checkBox3 = driver.findElement(By.xpath(".//*[@id='Content']/div[1]/blockquote[1]/form/input[3]"));
		WebElement checkBox4 = driver.findElement(By.xpath(".//*[@id='Content']/div[1]/blockquote[1]/form/input[4]"));
		WebElement checkBox5 = driver.findElement(By.xpath(".//*[@id='Content']/div[1]/blockquote[1]/form/input[5]"));
		
		//For Displaying CheckBox 1 details
		
		System.out.println(checkBox1.isDisplayed());
		System.out.println(checkBox1.isEnabled());
		System.out.println(checkBox1.isSelected());
		checkBox1.click();
		System.out.println(checkBox1.isSelected());
		checkBox1.click();
		System.out.println(checkBox1.isSelected());
		System.out.println("******checkBox1 Finished*******");
		System.out.println();
		
		//For Displaying CheckBox 2 details
		
		System.out.println(checkBox2.isDisplayed());
		System.out.println(checkBox2.isEnabled());
		System.out.println(checkBox2.isSelected());
		checkBox2.click();
		System.out.println(checkBox2.isSelected());
		checkBox2.click();
		System.out.println(checkBox2.isSelected());
		System.out.println("******checkBox2 Finished*******");
		System.out.println();
		
		//For Displaying CheckBox 3 details
		
		System.out.println(checkBox3.isDisplayed());
		System.out.println(checkBox3.isEnabled());
		System.out.println(checkBox3.isSelected());
		checkBox3.click();
		System.out.println(checkBox3.isSelected());
		checkBox3.click();
		System.out.println(checkBox3.isSelected());
		System.out.println("******checkBox3 Finished*******");
		System.out.println();
		
		//For Displaying CheckBox 4 details
		
		System.out.println(checkBox4.isDisplayed());
		System.out.println(checkBox4.isEnabled());
		System.out.println(checkBox4.isSelected());
		checkBox4.click();
		System.out.println(checkBox4.isSelected());
		checkBox4.click();
		System.out.println(checkBox4.isSelected());
		System.out.println("******checkBox4 Finished*******");
		System.out.println();
		
		//For Displaying CheckBox 5 details
		
		System.out.println(checkBox5.isDisplayed());
		System.out.println(checkBox5.isEnabled());
		System.out.println(checkBox5.isSelected());
		checkBox5.click();
		System.out.println(checkBox5.isSelected());
		checkBox5.click();
		System.out.println(checkBox5.isSelected());
		System.out.println("******checkBox5 Finished*******");
		System.out.println();
		
		Thread.sleep(3000);
	    
		driver.close();
	}
	

}