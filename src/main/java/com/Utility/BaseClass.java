package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static ExcelDataProvider excel;
@BeforeSuite
	public void BS() throws Exception {
	 excel=new ExcelDataProvider();
	}
@Parameters({"BrowserName"})	
@BeforeMethod
	public void LaunchBrowser(String BrowserName) {
		//browser open
	if(BrowserName.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}else if(BrowserName.equalsIgnoreCase("Firefox")){
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver(); 
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	 }	
 }
	@AfterMethod
	public void closeBrowser() {
		// browser close
		driver.quit();
	}	
}
