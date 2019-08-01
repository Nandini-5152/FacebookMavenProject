package com.automation.utills;

import org.openqa.selenium.WebElement;

import com.automation.base.BaseClass;

public class SeleniumCore extends BaseClass {
	//normal selenium reusable methods

	public void enterText(WebElement locater,String text){
		locater.sendKeys(text);
	}

	public void clickOnElement(WebElement locater){
		locater.click();
	}

	public void isDisplayed(WebElement locater){
		locater.isDisplayed();
	}

}
