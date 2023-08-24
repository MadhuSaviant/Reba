package com.utilities;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;


public class Library {

	
	public static void Custom_SendKeys(WebElement element, String value, String fieldName)
	{
		try {
			element.sendKeys(value);
			System.out.println("Send successfully "+fieldName);
		}catch (Exception e) {
			System.out.println("Unable to sendkeys "+fieldName);
		}
	}
	
	public static void Custom_Click(WebElement element, String fieldName)
	{
		try {
			element.click();
			System.out.println("Click successfully "+fieldName);
		}catch (Exception e) {
			System.out.println("Unable to Click "+fieldName);
		}
	}

}
