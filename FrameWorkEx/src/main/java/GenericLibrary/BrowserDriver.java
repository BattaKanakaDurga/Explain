package GenericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDriver extends WebdriverCommonDriverLibrary implements ConstantInstanceDriver {
	
	static String chromeDriverKey = "webdriver.chrome.driver";
	static String chromeDriverPath = "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (12)\\chromedriver.exe";
	
	static String firfoxDriverKey = "webdriver.gecko.driver";
	static String firfoxDriverPath = "C:\\Users\\DELL\\Downloads\\geckodriver-v0.33.0-win64 (1)\\geckodriver.exe";
	
	static String EdgeDriverKey = "webdriver.Edge.driver";
	static String EdgeDriverPath = "C:\\Users\\DELL\\Downloads\\edgedriver_win32 (12)\\edgedriver.exe";
	
	
	public static WebDriver getBrowser(String browsertype)
	{
		
		
		switch(browsertype)
		{
		case "chrome":
			System.setProperty(chromeDriverKey, chromeDriverPath);
			driver = new ChromeDriver();
			deleteAllCookies();
			windowmaximize();
			break;
			
		case "firefox":
			System.setProperty(firfoxDriverKey, firfoxDriverPath);
			driver = new FirefoxDriver();
			deleteAllCookies();
			windowmaximize();
			break;
			
		case "edge":
			System.setProperty(EdgeDriverKey, EdgeDriverPath);
			driver = new EdgeDriver();
			deleteAllCookies();
			windowmaximize();
			break;	
			default:
				System.out.println("Invalid browser choice");
		}
		return driver;
			
			
		}
			
	}
	
	


