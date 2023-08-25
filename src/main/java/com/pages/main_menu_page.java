package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class main_menu_page {
	
	@FindBy(xpath="(//mat-icon[@role='img'][normalize-space()='menu'])[2]")
	private WebElement main_menu;
	
	@FindBy(xpath="//mat-icon[normalize-space()='notifications']")
	private WebElement notifications;
	
	@FindBy(xpath="//mat-icon[normalize-space()='person']")
	private WebElement account;
	
	@FindBy(xpath="(//mat-icon[@class='mat-icon notranslate red-color material-icons active mat-icon-no-color'])[1]")
	private WebElement myProperties;
	
	public WebElement main_menu () {
		return main_menu;
	}
	public WebElement notifications () {
		return notifications;
	}
	public WebElement account () {
		return account;
	}
	public WebElement myProperties () {
		return myProperties;
	}
}
