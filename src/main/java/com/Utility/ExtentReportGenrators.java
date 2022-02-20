package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrators {
	
	public static ExtentReports extent;
	public static ExtentReports getReport() {
		String path="C:\\Users\\Dell\\eclipse-workspace\\DSS_Nov\\Reports\\index.html";
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Automation Test Reports");
		reporter.config().setReportName("DSS Report");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("System", "DSS Project");
		extent.setSystemInfo("Module", "DSS Module");
		extent.setSystemInfo("Browser", "Chrome ");
		extent.setSystemInfo("QA", "Govin");
		return extent;
				
	}
}
