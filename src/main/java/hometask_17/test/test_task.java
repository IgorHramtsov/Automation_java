package hometask_17.test;

import hometask_16.task2;
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

public class test_task {

    private static final Logger logger = LoggerFactory.getLogger(task2.class);

    @Test
    public void test() throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=C:\\Users\\Igor\\AppData\\Local\\Google\\Chrome\\User Data\\NewTestProfile");

        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) " +
                "AppleWebKit/537.36 (KHTML, like Gecko) Chrome/115.0.0.0 Safari/537.36");

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.google.com/");

        WebElement searchInputBrain = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='APjFqb']")));
        searchInputBrain.sendKeys("brain");
        searchInputBrain.submit();

        WebElement linkBrain = driver.findElement(By.xpath("//span[text()='Brain - інтернет-магазин']"));
        linkBrain.click();

        WebElement notebooksAndPC = driver.findElement(By.xpath("//span[@class='menu-outer-text' and normalize-space(text())=\"Ноутбуки і комп'ютери\"]"));
        notebooksAndPC.click();

        WebElement notebooksButton = driver.findElement(By.xpath("//span[@class='link' and normalize-space(text())='Перейти']"));
        notebooksButton.click();

        WebElement clickShowBrands = driver.findElement(By.xpath("//a[@class='toggle-mcs' and text()='Розгорнути']"));
        clickShowBrands.click();

        WebElement clickHP = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='link_checkbox' and @title='Виробник HP' and contains(@href, 'filter=3-75001700000')]")));
        clickHP.click();

        WebElement showOptions = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='use_filter_link' and text()='Показати']")));
        showOptions.click();

    /*    WebElement sortDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[contains(@class, 'catalog-toolbar-sort') or contains(text(), 'Сортувати')]"))
        );
        new Actions(driver).moveToElement(sortDropdown).perform();

        WebElement expensiveToCheapOption = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[contains(text(),'Від дорогих до дешевих')]"))
        );
        expensiveToCheapOption.click();*/

        WebElement setPrice = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @placeholder='від' and contains(@class, 'min_cost')]")));
        Thread.sleep(1500);
        setPrice.sendKeys("130000");

        WebElement buttonOK = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class, 'btn-sumbit') and contains(text(), 'ok')]")));
        Thread.sleep(2000);
        buttonOK.click();

        WebElement addToBucket = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='add br-bbb-f' and @data-name='Ноутбук HP ZBook Ultra G1a (B30DLES)']//span[text()='Купити']")));
        addToBucket.click();
        Thread.sleep(5000);

        WebElement priceText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='checkout-modal-total-cost']")));
        String price = priceText.getText();
        logger.info("check price: " + price);

        WebElement nameText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='to_product' and contains(text(),'Ноутбук HP ZBook Ultra G1a (B30DLES)')]")));
        String name = nameText.getText();

        int priceInt = Integer.parseInt(price);

        if (priceInt < 150000) {
            logger.info("price is less than 150 000 UAH");
        } else {
            logger.info("price is more than 150 000 UAH");
        }

        logger.info("Model: " + name);
        logger.info("Price: " + priceInt);

        driver.quit();
    }
}
