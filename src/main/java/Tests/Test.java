package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Test {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }

    @org.testng.annotations.Test
    public void test() {
        WebElement searchField = driver.findElement(By.xpath("//*[@class=\"gLFyf\"]"));
        searchField.sendKeys("Hello", Keys.ENTER);
    }
    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
