package com.automation.moduleobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.base.BaseClass;

public class LoginLogoutObjects extends BaseClass{

	@FindBy(xpath="//input[@id='email']")
	public WebElement usernamelocater;

	@FindBy(xpath="//input[@id='pass']")
	public WebElement passwordlocater;

	@FindBy(xpath="//input[@type='submit']")
	public WebElement loginlocater;
}
