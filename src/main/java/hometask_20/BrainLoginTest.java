package hometask_20;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

@Epic("Brain Site Tests")
@Feature("Login")
public class BrainLoginTest {

    private WebDriver driver;
    private Logger log = Logger.getLogger(BrainLoginTest.class);

    @BeforeMethod
    public void setup() {
        log.info("Initializing WebDriver");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    @Story("Valid Login")
    @Description("Check login form exists and can submit credentials")
    @Severity(SeverityLevel.CRITICAL)
    public void testLoginFormPresent() {
        log.info("Opening brain login page");
        driver.get("https://opt.brain.com.ua/dealer/login");  // Страница авторизации Brain

        log.info("Verifying login form elements");
        WebElement loginForm = driver.findElement(By.tagName("form"));
        Assert.assertNotNull(loginForm, "Login form should be present");

        WebElement loginField = driver.findElement(By.name("login"));
        WebElement passwordField = driver.findElement(By.name("password"));
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));

        Assert.assertTrue(loginField.isDisplayed(), "Login field should be visible");
        Assert.assertTrue(passwordField.isDisplayed(), "Password field should be visible");
        Assert.assertTrue(submitButton.isDisplayed(), "Submit button should be visible");
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            log.info("Closing WebDriver");
            driver.quit();
        }
    }
}