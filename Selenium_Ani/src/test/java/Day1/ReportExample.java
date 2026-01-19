package Day1;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExtentReports extent= new ExtentReports();
		ExtentSparkReporter spark= new ExtentSparkReporter("AD.html");
		spark.config().setTheme(Theme.DARK);
		extent.attachReporter(spark);
		
		ExtentTest test= extent.createTest("Login test");
		test.pass("Test is Pass");
		test.fail("Test is Fail");
		extent.flush();
	}

}
