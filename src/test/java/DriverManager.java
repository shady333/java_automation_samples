import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager {

    private static WebDriver driver = null;

    public static WebDriver getDriver(){

        if(driver == null) {
            System.setProperty("webdriver.chrome.driver", "/Users/oleg_dudar/Projects/WEB_DRIVERS/chromedriver");

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        return driver;

    }

    public static void reinit(){
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
