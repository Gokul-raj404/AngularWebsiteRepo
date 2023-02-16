package cucumber;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    public static ExtentReports extentReports;
    public static ExtentTest extentTest;

    @Override
    public void onStart(ITestContext context) {
        String reportName = "ExtentReport.html";
        extentReports = new ExtentReports();
        extentReports.attachReporter(new ExtentHtmlReporter(reportName));
    }

    @Override
    public void onTestStart(ITestResult result) {
    	extentTest = extentReports.createTest(result.getMethod().getMethodName() + ": " + result.getMethod().getDescription());
    }
    

    @Override
    public void onTestSuccess(ITestResult result) {
        extentTest.log(Status.PASS, "Test passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        extentTest.log(Status.FAIL, "Test failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        extentTest.log(Status.SKIP, "Test skipped");
    }

    @Override
    public void onFinish(ITestContext context) {
        extentReports.flush();
    }
}

