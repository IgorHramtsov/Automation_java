package hometask_16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class task2 {

    private static final Logger log = LoggerFactory.getLogger(task2.class);

    @Test
    public void test() {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=C:\\Users\\Igor\\AppData\\Local\\Google\\Chrome\\User Data\\NewTestProfile");

        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) " +
                "AppleWebKit/537.36 (KHTML, like Gecko) Chrome/115.0.0.0 Safari/537.36");

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://ru.wikipedia.org/?l");

        String headingText = driver.findElement(By.xpath("//h1[@id=\"Добро_пожаловать_в_Википедию,\"]")).getText();
        assertEquals(headingText, "Добро пожаловать в Википедию,");

        driver.findElement(By.xpath("//li[contains(@class,'interlanguage-link')]/a[@lang='en']")).click();

        driver.findElement(By.xpath("//span[text()='Log in']")).click();

        WebElement login = driver.findElement(By.xpath("//input[@id='wpName1']"));
        login.sendKeys("Igor29012000");

        WebElement password = driver.findElement(By.xpath("//input[@id='wpPassword1']"));
        password.sendKeys("fgsdfgergdf");

        driver.findElement(By.xpath("//button[@id='wpLoginAttempt']")).click();

        String error = driver.findElement(By.xpath("//div[@class='cdx-message__content' and contains(text(), 'Incorrect username or password')]")).getText();
        assertEquals(error, "Incorrect username or password entered. Please try again.");

        driver.quit();
    }
}
