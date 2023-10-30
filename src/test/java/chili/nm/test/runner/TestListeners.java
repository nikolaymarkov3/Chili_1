package chili.nm.test.runner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {
    private static final Logger LOGGER = LogManager.getLogger(TestListeners.class.getName());

    @Override
    public void onTestStart(ITestResult iTestResult) {
        LOGGER.info(String.format("Test started: %s", iTestResult.getName()));
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        LOGGER.info(String.format("Test passed: %s", iTestResult.getName()));
    }

    @Override
    public void onTestFailure(ITestResult result) {
        new AllureService().screenshot();
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        LOGGER.info(String.format("Test skipped: %s", iTestResult.getName()));
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        LOGGER.info(String.format("est failed but within success percentage: %s", iTestResult.getName()));
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        LOGGER.info(String.format("Test started: %s", iTestContext.getName()));
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        LOGGER.info(String.format("Test finished: %s", iTestContext.getName()));
    }
}