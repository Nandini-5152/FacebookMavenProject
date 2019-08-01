package com.automation.modulescript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.automation.moduleutils.LoginLogoutUtils;

public class LoginLogoutScript extends BaseClass {

	public LoginLogoutUtils loginLogoutUtils;
	
	@BeforeSuite
	public void browserLaunch(){
		initBrowser("chrome");
		getUrl("https://www.facebook.com/");
	}
	
	@BeforeClass
	public void loadFiles(){
		loadProbFile();
		loginLogoutUtils = PageFactory.initElements(driver,LoginLogoutUtils.class);
	}
	
	@Test
	public void loginDetails(){
		loginLogoutUtils.appLogin("samplefb@gmail.com", "sample");
	}
}
