package com.automation.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {

	public WebDriver driver=null;
	String currDir = System.getProperty("user.dir");
	public Properties prob;

	public void initBrowser(String browser){
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", currDir+"\\src\\main\\resources\\Browsers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", currDir+"\\src\\main\\resources\\Browsers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		}else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", currDir+"\\src\\main\\resources\\Browsers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}else {
			System.out.println("Given browser is not avilable");
		}
	}

	public void getUrl(String url){
		driver.get(url);
	}

	public void loadProbFile(){
		try {
			FileInputStream fis = new FileInputStream(currDir+"\\src\\main\\resources\\ConfigFile\\Config.properties");
			prob = new Properties();
			prob.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


}
