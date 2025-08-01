package hometask_18.PO.po;

import hometask_16.task2;
import hometask_18.PO.util.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.logging.LogManager;

public abstract class BasePage {

    protected static final Logger logger = LoggerFactory.getLogger(BasePage.class);
    protected WebDriver driver;

    public BasePage() {
     driver = DriverManager.getWebDriver();
        PageFactory.initElements(driver, this);
    }
}
