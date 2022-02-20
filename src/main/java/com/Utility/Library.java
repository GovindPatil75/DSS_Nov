package com.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	
	public static ExtentTest test;
	
	public static void custom_SendKeys(WebElement element,String value,String FieldName) {
		try {
			if(element.isDisplayed() && element.isEnabled()) {
				element.sendKeys(value);
				test.log(Status.PASS, FieldName+"== Value Sucessfully send =="+value);
			}else {
				System.out.println("element not diapleyed or enebaled");
			}
		}catch(Exception e) {
			test.log(Status.FAIL,"unable to send Value "+e);
			
		}
	}
	
	public static void custom_click(WebElement element,String fieldname) {
		try {
			element.click();
			test.log(Status.PASS, "clicked succesfully =="+fieldname);
		}catch(Exception e) {
			test.log(Status.FAIL ,"unable to click WebElement "+e);
		}
	}
	
	public static void custom_handleDropDown(WebElement element,String text) {
		
		try {
			Select s=new Select(element);
			s.selectByVisibleText(text);
			
		}catch(Exception e) {
			System.out.println("unable to select dropDown value "+e);
		}

	}
	
}
