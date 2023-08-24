package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.Login_Page;
import com.utilities.BaseClass;
import com.utilities.Library;

public class TC_login_page extends BaseClass{
	Login_Page rent=PageFactory.initElements(driver, Login_Page.class);
	
	
	
	
	
	
	@Test
	
	public void verify_forgotPaswordLink()
	{
		Login_Page rent=PageFactory.initElements(driver, Login_Page.class);
		rent.forgot_password().click();
	}
	@Test
	public void verify_login_pageAgain()
	{
		
		Library.Custom_SendKeys(rent.Login_Id(), excel.getStringData("Sheet1", 0, 1),"Email ID send successfully");
		Library.Custom_SendKeys(rent.password(), excel.getStringData("Sheet1", 1, 1), "Password send successfully");
		Library.Custom_Click(rent.login_Btn(), "Login button clicks successfully");
	}
}
