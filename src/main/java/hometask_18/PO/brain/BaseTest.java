package hometask_18.PO.brain;

import hometask_18.PO.po.BrainCaralogPO;
import hometask_18.PO.util.DriverManager;
import hometask_18.PO.util.PropertyManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static hometask_18.PO.util.Constants.MAIN_PAGE_URL_PROPERTY;
import static org.testng.AssertJUnit.assertTrue;

public abstract class BaseTest {

    protected BrainCaralogPO brainCaralogPO;
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = DriverManager.getWebDriver();
        brainCaralogPO = new BrainCaralogPO();
    }

    @BeforeMethod
    public void openBasePage(){
        driver.get(PropertyManager.getPropertyValue(MAIN_PAGE_URL_PROPERTY));
        assertTrue("Brain logo should be displayed, but it is not", brainCaralogPO.isLogoDisplayed());
    }

    @AfterClass
    public void quitDriver() {
        DriverManager.quitDriver();
    }
}
