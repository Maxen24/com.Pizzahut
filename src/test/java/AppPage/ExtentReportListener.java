package AppPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentReportListener implements ITestListener {
    private ExtentReports extent;
    private ExtentTest test;

    public void onStart(ITestContext context) {
        // Initialize ExtentReports
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent-report.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

    public void onTestStart(ITestResult result) {
        // Create a test in ExtentReports for each test method
        test = extent.createTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {
        // Log a PASS status for the entire test method
        test.log(Status.PASS, "Test passed");
    }

    public void onTestFailure(ITestResult result) {
        // Log a FAIL status for the entire test method and capture the exception
        test.log(Status.FAIL, "Test failed");
        test.log(Status.FAIL, result.getThrowable());
    }

    public void onTestSkipped(ITestResult result) {
        // Log a SKIP status for the entire test method
        test.log(Status.SKIP, "Test skipped");
    }

    public void onFinish(ITestContext context) {
        // Flush ExtentReports to generate the final report
        extent.flush();
    }

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
}