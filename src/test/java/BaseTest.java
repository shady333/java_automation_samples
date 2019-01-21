import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.util.concurrent.TimeUnit;



public class BaseTest {

    @BeforeMethod
    public void BeforeMethod(){
        DriverManager.reinit();
    }

    @AfterMethod
    public void AfterMethod(){
        //screenShotGenerator(screenShotPath);

    }

    @AfterClass
    public void tearDown(){
        DriverManager.reinit();
    }

    public String  screenShotGenerator(){
        try{
            File scrFile = ((TakesScreenshot)DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);
            File scrResult = new File(System.getProperty("user.dir")+"/ScreenShots4Logs/"+ System.currentTimeMillis() +"screenshot.png");
            FileUtils.copyFile(scrFile, scrResult);
            return scrResult.getPath();
        }
        catch (Exception ex){
            return null;
        }

    }


}
