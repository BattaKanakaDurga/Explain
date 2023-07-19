package Admin_feature_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLibrary.WebdriverCommonDriverLibrary;

public class User_add_Page extends WebdriverCommonDriverLibrary {
	
	@FindBy(xpath = "//*[text()='Admin']")
	private WebElement user_role;
	
	@FindBy(xpath = "(//*[@class='oxd-input oxd-input--active'])[2]")
	private WebElement employee;
	
	@FindBy(xpath = "//*[text()='Admin']")
	private WebElement admin_button;
	
	@FindBy(xpath = "(//*[@class='oxd-input oxd-input--active'])[2]")
	private WebElement username_textbox;
	
	@FindBy(xpath = "//*[text()='Admin']")
	private WebElement admin_button;
	
	@FindBy(xpath = "(//*[@class='oxd-input oxd-input--active'])[2]")
	private WebElement username_textbox;
	
	@FindBy(xpath = "(//*[@class='oxd-input oxd-input--active'])[2]")
	private WebElement save;
	
	public void userAdd()
	{
		
		
		
		
	}

}
