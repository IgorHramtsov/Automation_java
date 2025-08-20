package hometask_20;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.*;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

@Epic("Brain Site Tests")
@Feature("Login")

public class TribunaLoginTest {

    private WebDriver driver;
    private WebDriverWait wait;
    private static final Logger logger = Logger.getLogger(TribunaLoginTest.class);

    @BeforeMethod
    public void setup() {
        logger.info("Initializing WebDriver");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    @Story("Check credentials")
    @Description("Check login and passsword forms and can submit credentials")
    @Severity(SeverityLevel.CRITICAL)

    public void testLoginFormPresent() {
        logger.info("Opening Tribuna login page");
        driver.get("https://ua.tribuna.com/uk/");  // Страница авторизации Tribuna

        logger.info("Check login button");
        WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space(text())='Увійти']"));
        loginButton.click();

        logger.info("Enter Credentials");
        WebElement loginField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
        loginField.sendKeys("***********");

        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password' and @placeholder='Ваш пароль']")));
        passwordField.sendKeys("********");

        logger.info("Click submit button");
        WebElement submitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@class,'_auth__btns__btn') and normalize-space(text())='Увійти']")));
        submitButton.click();
    }

 /*   @Test(dependsOnMethods = {"testLoginFormPresent"})
    public void checkProfile() {
        logger.info("Check profile");

        WebElement profileButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//svg[contains(@width,'24') and contains(@height,'24')]")
        ));
        profileButton.click();

        WebElement myProfileButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space(text())='Мій профіль']")));
        myProfileButton.click();

        WebElement profileName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[normalize-space(text())='vitya_LEON']")));
        String profileNameText = profileName.getText();
        logger.info(profileNameText + "profile name"); */

    @AfterMethod
    public void closeBrowser() {
        if (driver != null) {
            logger.info("Closing WebDriver");
            driver.quit();
        }
    }
}
