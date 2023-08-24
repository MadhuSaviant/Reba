package com.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static ConfigDataProvider config;
	public static ExcelDataProvider excel;
	
	@BeforeSuite 
	public void BS() throws Exception {
		config = new ConfigDataProvider();
		excel= new ExcelDataProvider();
	}
	@BeforeMethod
	public void SetUp () 
	{
	//	if(BrowserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();  
			driver.get(config.Reba_Rent());
	}

	
	@AfterMethod
	public void tearDown () {	
	//driver.quit();
	}
}

