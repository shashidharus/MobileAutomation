package core.managers;

import api.android.Android;
import core.MyLogger;
import core.Retry;
import core.TestInfo;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

/**
 * Created by ssha05u on 10/11/2016.
 */
public class TestManager implements ITestListener,IRetryAnalyzer{

    public static TestInfo testInfo = new TestInfo();
    private int retryCount = 0;
    private int maxRetryCount = 1;
    /*@Rule
    public Retry retry = new Retry(3);
    @Rule
    public TestRule listen = new TestWatcher() {
        @Override
        public void failed(Throwable t, Description description) {
            MyLogger.log.info("Test Failed:");
            TestInfo.printResults();
        }

        @Override
        public void succeeded(Description description) {
            MyLogger.log.info("Test Passed:");
            TestInfo.printResults();
        }
    };*/
    String filePath = "C:\\Users\\ssha05u\\Documents\\Test Screenshots\\Cub";

    @BeforeTest
    public void before() {
        testInfo.reset();
    }

    public void takeScreenShot(String methodName) {
        //get the driver
        File scrFile = ((TakesScreenshot) Android.driver).getScreenshotAs(OutputType.FILE);
        //The below method will save the screen shot in d drive with test method name
        try {
            FileUtils.copyFile(scrFile, new File(filePath + methodName + ".png"));
            System.out.println("***Placed screen shot in " + filePath + " ***");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        MyLogger.log.info("Test Passed:");
        TestInfo.printResults();
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        MyLogger.log.info("Test Failed:");
        String methodName = iTestResult.getName().toString().trim();
        testInfo.suite(methodName);
        TestInfo.printResults();
        takeScreenShot(methodName);
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        MyLogger.log.info("Test Skipped:");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        MyLogger.log.info("WithinSuccessPercentage:");
    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }

    @Override
    public boolean retry(ITestResult iTestResult) {
        try {
            if (iTestResult.getThrowable().toString()
                    .contains("NoSuchElementException")) // Checking for specific reasons of failure
                if (retryCount < maxRetryCount) {
                    retryCount++;
                    return true;
                }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
}
