package hometask_18.PO.po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrainCaralogPO extends BrainHeaderPO {

    @FindBy(xpath = "")
    private WebElement catalogHeading;

    public String getCatalogHeading() {
        return catalogHeading.getText();
    }

}
