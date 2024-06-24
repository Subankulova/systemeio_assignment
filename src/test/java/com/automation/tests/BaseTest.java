package com.automation.tests;
import com.automation.pages.MakeMoneyHome;
import com.automation.pages.ThankYouPage;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
public class BaseTest {
    MakeMoneyHome makeMoneyHome;
    ThankYouPage thankYouPage;


    @BeforeMethod
    public void setUp() {
        // Create the driver
        ConfigReader.initProperties();
        DriverUtils.createDriver();
        initPageObject();
    }

    @AfterMethod
    public void cleanUp() {
        DriverUtils.getDriver().quit();
    }

    public void initPageObject() {
        // Initialize the page object
        makeMoneyHome = new MakeMoneyHome();
        thankYouPage = new ThankYouPage();

    }
}