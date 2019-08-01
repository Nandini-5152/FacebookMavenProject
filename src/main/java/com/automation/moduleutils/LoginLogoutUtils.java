package com.automation.moduleutils;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.moduleobjects.LoginLogoutObjects;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtils;

public class LoginLogoutUtils extends BaseClass{

	public SeleniumCore seleniumCore;
	public SeleniumUtils seleniumUtils;
	public LoginLogoutObjects loginLogoutObjects;

	public LoginLogoutUtils(){
		seleniumCore = PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtils = PageFactory.initElements(driver, SeleniumUtils.class);
		loginLogoutObjects = PageFactory.initElements(driver, LoginLogoutObjects.class);
	}

	public void appLogin(String name,String pass){
		seleniumCore.enterText(loginLogoutObjects.usernamelocater, name);
		seleniumCore.enterText(loginLogoutObjects.passwordlocater, pass);
		seleniumCore.clickOnElement(loginLogoutObjects.loginlocater);
	}
}
