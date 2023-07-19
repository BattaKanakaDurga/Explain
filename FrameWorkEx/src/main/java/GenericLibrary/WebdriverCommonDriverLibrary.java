package GenericLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebdriverCommonDriverLibrary {
	
	public static WebDriver driver;

	public void waitForDOMElement()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	public static void deleteAllCookies()
	{
		driver.manage().deleteAllCookies();
	}
	
	public static void windowmaximize()
	{
		driver.manage().window().maximize();
	}
	
	
	public void highlightOnElement(WebElement element)
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='2px solid red'", element);  
		
		   

		
	}
}
