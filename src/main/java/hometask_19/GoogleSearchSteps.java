package hometask_19;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GoogleSearchSteps {

    WebDriver driver;

    @Given("Google page is opened")
    public void open_google_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }

    @When("I search for Wikipedia")
    public void search_for_wikipedia() {
        driver.findElement(By.name("q")).sendKeys("Wikipedia");
        driver.findElement(By.name("q")).submit();
    }

    @Then("I see search results for Wikipedia")
    public void verify_results() {
        boolean isPresent = driver.getPageSource().contains("Wikipedia");
        Assert.assertTrue(isPresent, "Wikipedia should be in search results");
        driver.quit();
    }
}
