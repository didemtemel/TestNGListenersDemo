package ListenersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.TestUtils;

import java.io.IOException;


public class TestNGListeners extends TestUtils implements ITestListener {


    public void onStart(ITestContext context) {

    }

    public void onFinish(ITestContext context) {
        System.out.println("*****Test is finished******* : " + context.getName());
    }

    public void onTestStart(ITestResult result) {
        System.out.println("*****Test is started******* : " + result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("*****Test is sucessfull******* : " + result.getName());
    }

    public void onTestFailure(ITestResult result) {
        String testName = result.getName();
        System.out.println("*****Test is failed, screenshot captured******* : " + testName);

        try {
            takeScreenShot();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("*****Test is skipped******* : " + result.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("*****Test is failed but within success percentage******* : " +result.getName());
    }
}
