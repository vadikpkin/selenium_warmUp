package test;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.HorizontalSliderPage;
import static org.testng.Assert.*;

public class HorizontalSliderTest extends BaseTest {

    @Test
    public void horizontalSliderTest() {
        HomePage homePage = new HomePage(getDriver());
        HorizontalSliderPage horizontalSliderPage = homePage.selectHorizontalSliderPage();
        int timesToMoveSlider = 3;
        horizontalSliderPage.moveSliderRight(timesToMoveSlider);
        assertEquals(timesToMoveSlider * 0.5, Double.valueOf(horizontalSliderPage.getSliderValue()));
    }
}
