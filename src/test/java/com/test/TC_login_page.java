package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.Login_Page;
import com.pages.main_menu_page;
import com.utilities.BaseClass;
import com.utilities.Library;

public class TC_login_page extends BaseClass{
	Login_Page rent=PageFactory.initElements(driver, Login_Page.class);
	
//	@Test
//	public void verify_forgotPaswordLink()
//	{
//		Login_Page rent=PageFactory.initElements(driver, Login_Page.class);
//		rent.forgot_password().click();
//	}
//	
	
	@Test
	public void verify_login_pageAgain() throws Exception
	{
		Login_Page rent=PageFactory.initElements(driver, Login_Page.class);
		
		rent.Login_Id().sendKeys("swati_goswami@saviantconsulting.com");
		rent.password().sendKeys("rebadev");
		rent.login_Btn().click();
		Thread.sleep(4000);
		
		rent.main_menu().click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		rent.account().click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		rent.notifications().click();
		Thread.sleep(4000);
		driver.navigate().refresh();
		rent.myProperties().click();
		
		
		
//		Library.Custom_SendKeys(rent.Login_Id(), excel.getStringData("Sheet1", 0, 1),"Email ID send successfully");
//		Library.Custom_SendKeys(rent.password(), excel.getStringData("Sheet1", 1, 1), "Password send successfully");
//		Library.Custom_Click(rent.login_Btn(), "Login button clicks successfully");
	}

}
