package hometask_16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class task1 {

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

        driver.findElement(By.xpath("//li[contains(@class,'interlanguage-link')]/a[@lang='en']")).click();

        String headingText = driver.findElement(By.xpath("//h1[@id='Welcome_to_Wikipedia']")).getText();
        assertEquals(headingText, "Welcome to Wikipedia");

        String nameAcc = driver.findElement(By.xpath("//span[text()='IgorHram29012000']")).getText();
        assertEquals(nameAcc, "IgorHram29012000");

        WebElement searchInput = driver.findElement(By.xpath("//input[@id='searchInput']"));
        searchInput.sendKeys("Ukraine");
        searchInput.submit();

        String title = driver.findElement(By.xpath("//span[@class='mw-page-title-main']")).getText();
        assertEquals(title, "Ukraine");

        driver.quit();
    }
}
