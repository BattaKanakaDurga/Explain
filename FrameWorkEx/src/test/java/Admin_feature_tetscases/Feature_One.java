package Admin_feature_tetscases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Admin_feature_pages.feature1_page;
import GenericLibrary.ConstantInstanceDriver;
import LoginLogot_page.Login_Page;
import Login_logout_case.Login_testcase;

public class Feature_One extends Login_testcase {
	
	@Test
	public void adminCase()
	
	{
		//login
		Login_Page loginpage = PageFactory.initElements(driver, Login_Page.class);
		loginpage.Login(ConstantInstanceDriver.Username, ConstantInstanceDriver.Password);
		System.out.println("logged in successfully");
		
		feature1_page fp = PageFactory.initElements(driver, feature1_page.class);
		fp.adminCheck();
		
		String expected = "Automation Tester";
		String actual = "Automation ";
		Assert.assertEquals(actual, expected);
		System.out.println("Testcase got passed");
		
		Assert.assertTrue(10<20);
		
			System.out.println("Testcase passed");
		
		
	
	
		
	}
	

}
