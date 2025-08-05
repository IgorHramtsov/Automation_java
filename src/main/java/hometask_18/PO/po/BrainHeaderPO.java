package hometask_18.PO.po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class BrainHeaderPO extends BasePage {

    @FindBys({

    })
    private WebElement searchInput;

    @FindAll({

    })
    private WebElement searchSubmitButton;

    @FindBy(xpath = "")
    private WebElement logoImage;

    @FindBy(tagName = "input")
    private List<WebElement> inputFields;

    public void clickOnSearchButton() {
        searchSubmitButton.click();
        logger.info("Click on the 'Submit' search button");
    }

    public void fillSearchInput(String searchText) {
        searchInput.sendKeys(searchText);
    }

    public boolean isLogoDisplayed() {
        return logoImage.isDisplayed();
    }

}
