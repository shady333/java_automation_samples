import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.File;

public class CustomTestListener extends BaseTest implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("CUSTOM HERE");
        Reporter.log("Test Passed\n");
    }

    @Override
    public void onTestFailure(ITestResult result){

        Reporter.log("Test Failed\n");

        String screenShotPath = screenShotGenerator();

        System.setProperty("org.uncommons.reportng.escape-output", "false");

        Reporter.log(
                "<p><a title= \"title\" href=\"file://" + screenShotPath + "\">" +
                        "<img width=\"418\" height=\"240\" alt=\"alternativeName\" title=\"title\" src=\"file://"+screenShotPath+"\"></a></p>");


        Reporter.log("<hr><br>Path to Screenshot - "+screenShotPath);
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }

//    @Attachment(value = "Page screenshot", type = "image/png")
//    private byte[] captureScreenshot() {
//        return ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
//    }


}
