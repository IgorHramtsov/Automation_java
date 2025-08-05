package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.nio.file.Paths;
import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class DemoTest {

    @Test
    public void test(){

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=C:\\Users\\Igor\\AppData\\Local\\Google\\Chrome\\User Data\\NewTestProfile");
        // options.addArguments("profile-directory=Default"); // Удали эту строку или замени на имя профиля, если нужно

        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) " +
                "AppleWebKit/537.36 (KHTML, like Gecko) Chrome/115.0.0.0 Safari/537.36");

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.google.com/");

        WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
        searchInput.sendKeys("ChatGPT");
        searchInput.submit();

            driver
                .findElement(By.xpath("//div[@id='search']//h3[following-sibling::div//cite[text()='https://openai.com']]"))
                        .click();

        assertEquals(driver.getTitle(),"Introducing ChatGPT");

        driver.quit();
    }
}
