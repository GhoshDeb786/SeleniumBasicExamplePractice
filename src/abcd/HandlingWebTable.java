package abcd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://html.com/tables/");
		String s = driver.findElement(By.xpath(".//*[@id='post-382']/div/div[3]/table/tbody/tr[2]/td[1]")).getText();
		System.out.println(s);
		
		WebElement htmlTable = driver.findElement(By.id("post-382"));
		
		//For displaying Rows info
		
		List<WebElement> rows = htmlTable.findElements(By.tagName("tr"));
		System.out.println("Displaying Rows Info");
		System.out.println(rows.size());
		
		//For displaying Cells info
		
		List<WebElement> cells = htmlTable.findElements(By.tagName("td"));
		System.out.println("Displaying Cells Info");
		System.out.println(cells.size());
		
		//System.out.println(driver.findElement(By.xpath(".//*[@id='post-382']/div/div[3]/table/tbody/tr[1]/th[1]")).getText());
		//System.out.println(driver.findElement(By.xpath(".//*[@id='post-382']/div/div[3]/table/tbody/tr[1]/th[2]")).getText());
		//System.out.println(driver.findElement(By.xpath(".//*[@id='post-382']/div/div[3]/table/tbody/tr[2]/td[2]")).getText());

		
		driver.close();

	}

}