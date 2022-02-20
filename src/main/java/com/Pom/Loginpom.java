package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpom {
	WebDriver driver;
	
@FindBy(how=How.XPATH,using="//input[@id='email']")	
private WebElement emailId;

@FindBy(how=How.XPATH,using="//input[@id='pass']")
private WebElement Password;

@FindBy(how=How.XPATH,using="//button[@name='login']")
private WebElement Loginbtn;

public Loginpom(WebDriver driver) {
	this.driver=driver;
}

public WebElement getEmailId() {
	return emailId;
}

public WebElement getPassword() {
	return Password;
}

public WebElement getLoginbtn() {
	return Loginbtn;
}
}
