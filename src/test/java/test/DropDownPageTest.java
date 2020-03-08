package test;

import org.testng.annotations.Test;
import pages.DropDownPage;
import pages.HomePage;
import static org.testng.Assert.*;

public class DropDownPageTest extends BaseTest {

    @Test
    public void dropdownTestPage() {
        HomePage homePage = new HomePage(getDriver());
        DropDownPage dropDownPage = homePage.selectDropDownPage();
        String option = "Option 2";
        dropDownPage.selectFromDropdown(option);
        assertEquals(dropDownPage.getSelectedText().size(), 1, "Incorrect number of selections");
        assertTrue(dropDownPage.getSelectedText().contains(option), "Option not selected");
    }

}
