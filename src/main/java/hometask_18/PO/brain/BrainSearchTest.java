package hometask_18.PO.brain;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class BrainSearchTest extends BaseTest {

    @Test
    public void verifyBrainSearch() {
        String textToSearch = "Ноутбуки";
        brainCaralogPO.fillSearchInput(textToSearch);
        brainCaralogPO.clickOnSearchButton();
        assertEquals("Search catalog should be displayed fjr search input: " + textToSearch, brainCaralogPO.getCatalogHeading(), textToSearch);

    }
}
