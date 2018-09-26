package abcd;

public class TestCase11 extends UserDefined_TestCase10{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		
		//Admin Login Functionality with valid inputs

		//Test Case 2: Admin Login Functionality with valid inputs(Positive Test Case)

		//Create Object/Instance
		TestCase11 obj2 = new TestCase11();
		obj2.launchBrowser();
		obj2.adminLogin();
		String url = driver.getCurrentUrl();

		if (url.contains("http://www.gcrit.com/build3/admin/index.php")){
		System.out.println("Admin Login Successful - Passed"); 
		}
		else {
		System.out.println("Admin Login Unsuccessful - Failed"); 
		}
		obj2.closeBrowser();

	}

}