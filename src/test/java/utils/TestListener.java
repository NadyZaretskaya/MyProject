package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    private Logger log = LogManager.getRootLogger();


    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        log.info(result.getName()+" test case SUCCESS");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        log.error(result.getName()+" test case FAILED");
        ScreenShotService.saveScreenshot();
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        log.info(result.getName()+" test case SKIPPED");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        log.info(result.getName()+" test case FAILED WITH TIMEOUT");
        ScreenShotService.saveScreenshot();
    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
