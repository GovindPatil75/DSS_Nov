package com.Utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends BaseClass implements ITestListener{

	   ExtentReports extent=ExtentReportGenrators.getReport();
	   ThreadLocal<ExtentTest> extenttest=new ThreadLocal<ExtentTest>();
	   
	
	public void onTestStart(ITestResult result) {
		Library.test=extent.createTest(result.getTestClass().getName()+"=="+result.getMethod().getMethodName());
		extenttest.set(Library.test);
	}

	public void onTestSuccess(ITestResult result) {
		extenttest.get().log(Status.PASS, "Test case Pass");
		extenttest.get().pass("TC Pass Screenshot==>").addScreenCaptureFromBase64String(getCapture());
	}

	public void onTestFailure(ITestResult result) {
		extenttest.get().log(Status.FAIL, "Test Case Fail");
		extenttest.get().fail("TC Fail Screenshot==>").addScreenCaptureFromBase64String(getCapture());		
	}

	public void onTestSkipped(ITestResult result) {
		extenttest.get().log(Status.SKIP, "Test Case is Skip");
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}
	
	public String getCapture() {
		String src=((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		return src;
	}
	
	
	
	
	
	
}
