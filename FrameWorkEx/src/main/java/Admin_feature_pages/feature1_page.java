package Admin_feature_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLibrary.WebdriverCommonDriverLibrary;

public class feature1_page extends WebdriverCommonDriverLibrary{
	//Pagefactory
	@FindBy(xpath = "//*[text()='Admin']")
	private WebElement admin_button;
	
	@FindBy(xpath = "(//*[@class='oxd-input oxd-input--active'])[2]")
	private WebElement username_textbox;
	
	
	public void adminCheck()
	{
		waitForDOMElement();
		highlightOnElement(admin_button);
		admin_button.click();
		waitForDOMElement();
		highlightOnElement(username_textbox);
		username_textbox.sendKeys("test");
	}
	
}
