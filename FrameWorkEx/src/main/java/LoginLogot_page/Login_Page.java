package LoginLogot_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import GenericLibrary.WebdriverCommonDriverLibrary;

public class Login_Page extends WebdriverCommonDriverLibrary {
	
	
	@FindBy(xpath = "//*[@placeholder='Username']")
	private WebElement userName;
	
	@FindBy(xpath = "//*[@placeholder='Password']")
	private WebElement password;
	
	
	@FindBy(xpath = "//*[@type='submit']")
	private WebElement Login_button;
	
	@FindBy(xpath = "//*[@class='oxd-userdropdown-tab']")
	private WebElement user_dropdown;
	
	@FindBy(xpath = "//*[text()='Logout']")
	private WebElement logout_button;
	
	@BeforeTest
	public void Login(String Username, String Password)
	{
		waitForDOMElement();
		highlightOnElement(userName);
		userName.sendKeys(Username);
		waitForDOMElement();
		highlightOnElement(password);
		password.sendKeys(Password);
		waitForDOMElement();
		highlightOnElement(Login_button);
		Login_button.click();
		waitForDOMElement();
	}
	
	
	@AfterTest
	public void logout()
	{
		waitForDOMElement();
		highlightOnElement(user_dropdown);
		user_dropdown.click();
		waitForDOMElement();
		highlightOnElement(logout_button);
		logout_button.click();
		waitForDOMElement();
		
	}
	
	
	

}
