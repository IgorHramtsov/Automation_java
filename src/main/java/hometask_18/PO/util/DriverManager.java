package hometask_18.PO.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManager {

    public static WebDriver driver;

    private DriverManager() {}

    public static WebDriver getWebDriver() {
        if(driver == null) {
            setUpDriver();
        }
        return driver;
    }

    private static void setUpDriver() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    public static void quitDriver() {
        if(driver != null) {
            driver.quit();
        }
    }
}
