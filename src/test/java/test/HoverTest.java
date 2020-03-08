package test;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.HoverPage;
import static org.testng.Assert.*;

public class HoverTest extends BaseTest {

    @Test
    public void hoverOverTest(){
        HomePage homePage = new HomePage(getDriver());
        HoverPage hoverPage = homePage.selectHoverPage();
        HoverPage.ImageCaption  caption = hoverPage.hoverOverImage(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        assertEquals(caption.getTitle(), "name: user1", "Caption title incorrect");
        assertEquals(caption.getLinkText(), "View profile", "Caption link text incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");
    }
}
