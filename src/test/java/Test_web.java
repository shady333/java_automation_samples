
import org.apache.commons.logging.impl.LogFactoryImpl;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.concurrent.TimeUnit;

public class Test_web extends BaseTest{

    Logger LOG = Logger.getLogger(Test_web.class);

    @Test
    public void test_uno(){
        System.out.println("Test 1 PASS");
        Reporter.log("TestNG message test 1");
        LOG.info("INFO");
        LOG.debug("DEBUG");
        LOG.error("ERROR");


        getDriver().get("https://mail.ukr.net/desktop/login");

        Assert.assertEquals(true, true, "Error here");


    }

    @Test
    public void test_duo(){
        System.out.println("Test 2 fail");
        Reporter.log("TestNG message test 2");
        LOG.info("INFO");
        LOG.debug("DEBUG");
        LOG.error("ERROR");

        getDriver().get("http://gmail.com");

        Assert.assertEquals(true, true, "Error here");
    }
}
