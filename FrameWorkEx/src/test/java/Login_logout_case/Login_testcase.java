package Login_logout_case;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import GenericLibrary.BrowserDriver;
import GenericLibrary.ConstantInstanceDriver;
import LoginLogot_page.Login_Page;

public class Login_testcase extends BrowserDriver {

	@BeforeMethod
	public void OpenBrowser()
	{
		
		BrowserDriver.getBrowser(ConstantInstanceDriver.browser).get(ConstantInstanceDriver.url);
		System.out.println("application launch");
		
		
	}
	
//	
//	public void loginOnOrange()
//	{
//		Login_Page l = PageFactory.initElements(driver, Login_Page.class);
//		l.Login(ConstantInstanceDriver.Username, ConstantInstanceDriver.Password);
//		System.out.println("Entered Username & password");
//	}
	
	
	@AfterMethod
	public void logout_orange() throws InterruptedException
	{
		Login_Page loginpage = PageFactory.initElements(driver, Login_Page.class);
		loginpage.logout();
		System.out.println("logged out successfully");
		Thread.sleep(10000);
		driver.close();
	}
	
	
}
