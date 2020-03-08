package test;

import org.testng.annotations.Test;
import pages.ContexMenuPage;
import pages.HomePage;
import static org.testng.Assert.*;

public class ContexMenuTests extends BaseTest {

    @Test
    public void contexMenuTest() {
        HomePage homePage = new HomePage(getDriver());
        ContexMenuPage contexMenuPage = homePage.selectContexMenuPage();
        contexMenuPage.rightClickContexMenuTrigger();
        assertEquals(contexMenuPage.getAlertText(), "You selected a context menu");
    }
}
