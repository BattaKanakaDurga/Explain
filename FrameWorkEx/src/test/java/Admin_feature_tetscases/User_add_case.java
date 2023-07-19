package Admin_feature_tetscases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_feature_pages.User_add_Page;
import Admin_feature_pages.feature1_page;
import GenericLibrary.ConstantInstanceDriver;
import LoginLogot_page.Login_Page;
import Login_logout_case.Login_testcase;

public class User_add_case extends Login_testcase {
	@Test
public void adminCase()
	
	{
		//login
		Login_Page loginpage = PageFactory.initElements(driver, Login_Page.class);
		loginpage.Login(ConstantInstanceDriver.Username, ConstantInstanceDriver.Password);
		System.out.println("logged in successfully");
		
		User_add_Page uap = PageFactory.initElements(driver, User_add_Page.class);
		uap.userAdd();
	
		
	}

}
