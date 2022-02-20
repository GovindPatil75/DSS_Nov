package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Pom.Loginpom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Verify_login extends BaseClass {
	
	@Test
	public void verify_login_tc_001() {
				
		Loginpom login=PageFactory.initElements(driver, Loginpom.class);
		
		Library.custom_SendKeys(login.getEmailId(),excel.getStringData("Sheet1", 1, 0), "EmailId");
		Library.custom_SendKeys(login.getPassword(),excel.getNumericData("Sheet1", 1, 1), "Password");
		Library.custom_click(login.getLoginbtn(), "Login Button");
		
		
	}
}
