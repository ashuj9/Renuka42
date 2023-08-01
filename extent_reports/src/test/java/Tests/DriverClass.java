package Tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class DriverClass {
	static ExtentSparkReporter reporter;
	static ExtentReports extentreports;
	 public DriverClass()
	 {
		 reporter=new ExtentSparkReporter("ExtentReport.html");
		 extentreports=new ExtentReports();
		 extentreports.attachReporter(reporter);
	 }
	

}
